package com.example.RestTravelCarApi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestTravelCarApi.models.DTO.ActivityDTO;
import com.example.RestTravelCarApi.models.DTO.CategoryTourDTO;
import com.example.RestTravelCarApi.models.DTO.DepartureDateDetailDTO;
import com.example.RestTravelCarApi.models.DTO.ItineraryDTO;
import com.example.RestTravelCarApi.models.DTO.SuitableTourDTO;
import com.example.RestTravelCarApi.models.DTO.TourCategoryTourDTO;
import com.example.RestTravelCarApi.models.DTO.TourDepartureDateDTO;
import com.example.RestTravelCarApi.models.DTO.TourPackageDetailDTO;
import com.example.RestTravelCarApi.models.DTO.TourSuitableTourDTO;
import com.example.RestTravelCarApi.models.DTO.ThemeTourDTO;
import com.example.RestTravelCarApi.models.DTO.ThemeTourDetailDTO;
import com.example.RestTravelCarApi.models.Entity.CategoryTour;
import com.example.RestTravelCarApi.models.Entity.Itinerary;
import com.example.RestTravelCarApi.models.Entity.ThemeTour;
import com.example.RestTravelCarApi.models.Entity.TourCategoryTour;
import com.example.RestTravelCarApi.models.Entity.TourDepartureDate;
import com.example.RestTravelCarApi.models.Entity.TourPackage;
// import com.example.RestTravelCarApi.models.Entity.TourResponse;
import com.example.RestTravelCarApi.models.Entity.TourSuitableTour;
import com.example.RestTravelCarApi.models.Entity.TourThemeTour;
import com.example.RestTravelCarApi.repository.TourCategoryTourRepository;
import com.example.RestTravelCarApi.repository.TourDepartureDateRepository;
import com.example.RestTravelCarApi.repository.TourPackageRepository;
import com.example.RestTravelCarApi.repository.TourSuitableTourRepository;
import com.example.RestTravelCarApi.repository.TourThemeTourRepository;
import com.example.RestTravelCarApi.repository.TourCategoryTourRepository;
import com.example.RestTravelCarApi.repository.TourPackageRepository;

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
    public TourPackageDetailDTO getTourPackageByPackageid(int packageid) {
        TourPackage tourPackage = tourPackageRepository.findByPackageid(packageid);
        List<ItineraryDTO> itineraries = tourPackage.getItineraries().stream()
                .map(itinerary -> {
                    ItineraryDTO dto = new ItineraryDTO();
                    dto.setItineraryId(itinerary.getItineraryId());
                    dto.setDay(itinerary.getDay());
                    List<ActivityDTO> activityDTOs = itinerary.getActivities().stream()
                            .map(activity -> {
                                ActivityDTO dto1 = new ActivityDTO();
                                dto1.setActivityid(activity.getActivityid());
                                dto1.setActivityname(activity.getActivityname());
                                dto1.setDescription(activity.getDescription());
                                dto1.setTimeperiod(activity.getTimeperiod());
                                dto1.setThumbnail(activity.getThumbnail());
                                dto1.setActivityType(activity.getActivitytype());
                                return dto1;
                            }).collect(Collectors.toList());

                    dto.setActivities(activityDTOs);
                    return dto;
                }).collect(Collectors.toList());
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

}
