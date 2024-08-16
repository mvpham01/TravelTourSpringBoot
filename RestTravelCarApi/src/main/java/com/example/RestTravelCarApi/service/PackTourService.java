package com.example.RestTravelCarApi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import com.example.RestTravelCarApi.models.DTO.TourPackageDTO;
import com.example.RestTravelCarApi.models.DTO.TourPackageDetailDTO;
import com.example.RestTravelCarApi.models.Entity.CategoryTour;
import com.example.RestTravelCarApi.models.Entity.DepartureDate;
import com.example.RestTravelCarApi.models.Entity.Itinerary;
import com.example.RestTravelCarApi.models.Entity.SuitableTour;
import com.example.RestTravelCarApi.models.Entity.ThemeTour;
import com.example.RestTravelCarApi.models.Entity.TourCategoryTour;
import com.example.RestTravelCarApi.models.Entity.TourDepartureDate;
import com.example.RestTravelCarApi.models.Entity.TourPackage;
// import com.example.RestTravelCarApi.models.Entity.TourResponse;
import com.example.RestTravelCarApi.models.Entity.TourSuitableTour;
import com.example.RestTravelCarApi.models.Entity.TourThemeTour;
import com.example.RestTravelCarApi.repository.CategoryTourRepository;
import com.example.RestTravelCarApi.repository.DepartureDateRepository;
import com.example.RestTravelCarApi.repository.SuitableTourRepository;
import com.example.RestTravelCarApi.repository.ThemeTourRepository;
import com.example.RestTravelCarApi.repository.TourCategoryTourRepository;
import com.example.RestTravelCarApi.repository.TourDepartureDateRepository;
import com.example.RestTravelCarApi.repository.TourPackageRepository;
import com.example.RestTravelCarApi.repository.TourSuitableTourRepository;
import com.example.RestTravelCarApi.repository.TourThemeTourRepository;

@Service
public class PackTourService {
    @Autowired
    private TourPackageRepository tourPackageRepository;

    @Autowired
    private TourCategoryTourRepository tourCategoryTourRepository;

    @Autowired
    private TourThemeTourRepository tourThemeTourRepository;

    @Autowired
    private TourDepartureDateRepository tourDepartureDateRepository;

    @Autowired
    private TourSuitableTourRepository tourSuitableTourRepository;

    @Autowired
    private CategoryTourRepository categoryTourRepository;

    @Autowired
    private ThemeTourRepository themeTourRepository;

    @Autowired
    private SuitableTourRepository suitableTourRepository;

    @Autowired
    private DepartureDateRepository departureDateRepository;

    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }

    public List<TourCategoryTour> getAllTourPackagesCategory() {
        return tourCategoryTourRepository.findAll();
    }

    public List<TourPackage> getAllTourPackagesByCategory(String cat) {
        return tourPackageRepository.findByCategoryTourName(cat);
    }

    public List<TourThemeTour> getAllTourPackagesTheme() {
        return tourThemeTourRepository.findAll();
    }

    public List<TourPackage> getToursByThemeTourName(String themeTourName) {
        return tourPackageRepository.findByThemeTourName(themeTourName);
    }

    public List<TourDepartureDate> getAllTourPackagesDepartureDate() {
        return tourDepartureDateRepository.findAll();
    }

    public List<TourSuitableTour> getAllTourPackagesSuitable() {
        return tourSuitableTourRepository.findAll();
    }

    public List<TourPackage> getToursBySuitableName(String suitableName) {
        return tourPackageRepository.findBySuitableName(suitableName);
    }

    public TourPackageDetailDTO getTourDetailByPackageid(int packageid) {
        TourPackage tourPackage = tourPackageRepository.findByPackageid(packageid);
        List<Itinerary> itineraries = tourPackage.getItineraries();
            
        TourPackageDetailDTO dto = new TourPackageDetailDTO();
        dto.setPackageid(tourPackage.getPackageid());
        dto.setTitle(tourPackage.getTitle());
        dto.setThumbnail(tourPackage.getThumbnail());
        dto.setPrice(tourPackage.getPrice());
        dto.setPricereduce(tourPackage.getPricereduce());
        dto.setGroupsize(tourPackage.getGroupsize());
        dto.setDeposit(tourPackage.getDeposit());
        dto.setBookinghold(tourPackage.getBookinghold());
        dto.setBookingchange(tourPackage.getBookingchange());
        dto.setItineraries(itineraries);
        dto.setCategoryTours(tourPackage.getCategoryTours());
        dto.setThemeTours(tourPackage.getThemeTours());
        dto.setDepartureDates(tourPackage.getDepartureDate());
        dto.setSuitableTours(tourPackage.getSuitableTours());
        return dto;
    }

    public TourPackage getTourPackageByPackageid(int id) {
        return tourPackageRepository.findByPackageid(id);
    }

    // Create a new tour
    public TourPackage createTour(TourPackageDTO tourPackageDTO) {
        TourPackage tourPackage = new TourPackage();
        // Map basic fields
        tourPackage.setTitle(tourPackageDTO.getTitle());
        tourPackage.setThumbnail(tourPackageDTO.getThumbnail());
        tourPackage.setPrice(tourPackageDTO.getPrice());
        tourPackage.setPricereduce(tourPackageDTO.getPricereduce());
        tourPackage.setGroupsize(tourPackageDTO.getGroupsize());
        tourPackage.setDeposit(tourPackageDTO.getDeposit());
        tourPackage.setBookinghold(tourPackageDTO.getBookinghold());
        tourPackage.setBookingchange(tourPackageDTO.getBookingchange());
        //!
        List<CategoryTour> categoryTours = categoryTourRepository.findAllById(tourPackageDTO.getCategoryTourId());
        tourPackage.setCategoryTours(categoryTours);
        // Convert themeTourNames to ThemeTour entities
        List<ThemeTour> themeTours = themeTourRepository.findAllById(tourPackageDTO.getThemeTourId());
        tourPackage.setThemeTours(themeTours);
        // Convert suitableTourNames to SuitableTour entities
        List<SuitableTour> suitableTours = suitableTourRepository.findAllById(tourPackageDTO.getSuitableTourId());
        tourPackage.setSuitableTours(suitableTours);
        // Convert departureDates, and create any missing ones
        List<Timestamp> departureDates = tourPackageDTO.getDepartureDateDate();
        List<DepartureDate> existingDepartureDates = departureDateRepository.findByDeparturedateIn(departureDates);
        // Find missing departure dates
        List<Timestamp> existingDates = existingDepartureDates.stream()
                .map(DepartureDate::getDeparturedate)
                .collect(Collectors.toList());
        List<Timestamp> missingDates = departureDates.stream()
                .filter(date -> !existingDates.contains(date))
                .collect(Collectors.toList());

        // Create and save new departure dates
        for (Timestamp missingDate : missingDates) {
            DepartureDate newDepartureDate = new DepartureDate();
            newDepartureDate.setDeparturedate(missingDate);
            departureDateRepository.save(newDepartureDate);
            existingDepartureDates.add(newDepartureDate);
        }
        tourPackage.setDepartureDate(existingDepartureDates);
        return tourPackageRepository.save(tourPackage);
    }

    public TourPackage updateTour(int id, TourPackageDTO tourPackageDTO) {
        Optional<TourPackage> existingTourOpt = tourPackageRepository.findById(id);
        if (existingTourOpt.isPresent()) {
            TourPackage tourPackage = existingTourOpt.get();

            // Map basic fields
            tourPackage.setTitle(tourPackageDTO.getTitle());
            tourPackage.setThumbnail(tourPackageDTO.getThumbnail());
            tourPackage.setPrice(tourPackageDTO.getPrice());
            tourPackage.setPricereduce(tourPackageDTO.getPricereduce());
            tourPackage.setGroupsize(tourPackageDTO.getGroupsize());
            tourPackage.setDeposit(tourPackageDTO.getDeposit());
            tourPackage.setBookinghold(tourPackageDTO.getBookinghold());
            tourPackage.setBookingchange(tourPackageDTO.getBookingchange());

            List<CategoryTour> categoryTours = categoryTourRepository.findAllById(tourPackageDTO.getCategoryTourId());
        tourPackage.setCategoryTours(categoryTours);
        // Convert themeTourNames to ThemeTour entities
        List<ThemeTour> themeTours = themeTourRepository.findAllById(tourPackageDTO.getThemeTourId());
        tourPackage.setThemeTours(themeTours);
        // Convert suitableTourNames to SuitableTour entities
        List<SuitableTour> suitableTours = suitableTourRepository.findAllById(tourPackageDTO.getSuitableTourId());
        tourPackage.setSuitableTours(suitableTours);
        // Convert departureDates, and create any missing ones
        List<Timestamp> departureDates = tourPackageDTO.getDepartureDateDate();
        List<DepartureDate> existingDepartureDates = departureDateRepository.findByDeparturedateIn(departureDates);
        // Find missing departure dates
        List<Timestamp> existingDates = existingDepartureDates.stream()
                .map(DepartureDate::getDeparturedate)
                .collect(Collectors.toList());
        List<Timestamp> missingDates = departureDates.stream()
                .filter(date -> !existingDates.contains(date))
                .collect(Collectors.toList());

        // Create and save new departure dates
        for (Timestamp missingDate : missingDates) {
            DepartureDate newDepartureDate = new DepartureDate();
            newDepartureDate.setDeparturedate(missingDate);
            departureDateRepository.save(newDepartureDate);
            existingDepartureDates.add(newDepartureDate);
        }
        tourPackage.setDepartureDate(existingDepartureDates);
            tourPackageRepository.save(tourPackage);
        }
        return null;
    }

    // Delete a tour
    public boolean deleteTour(int id) {
        Optional<TourPackage> tourPackage = tourPackageRepository.findById(id);
        if (tourPackage.isPresent()) {
            tourPackageRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
