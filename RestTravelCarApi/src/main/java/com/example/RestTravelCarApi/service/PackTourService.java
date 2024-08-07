package com.example.RestTravelCarApi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestTravelCarApi.models.CategoryTour;
import com.example.RestTravelCarApi.models.CategoryTourDTO;
import com.example.RestTravelCarApi.models.DepartureDateDTO;
import com.example.RestTravelCarApi.models.Itinerary;
import com.example.RestTravelCarApi.models.ItineraryDTO;
import com.example.RestTravelCarApi.models.ThemeTour;
import com.example.RestTravelCarApi.models.ThemeTourDTO;
import com.example.RestTravelCarApi.models.TourCategoryTour;
import com.example.RestTravelCarApi.models.TourCategoryTourDTO;
import com.example.RestTravelCarApi.models.TourDepartureDate;
import com.example.RestTravelCarApi.models.TourDepartureDateDTO;
import com.example.RestTravelCarApi.models.TourPackage;
import com.example.RestTravelCarApi.models.TourPackageDTO;
import com.example.RestTravelCarApi.models.TourResponse;
import com.example.RestTravelCarApi.models.TourSuitableTour;
import com.example.RestTravelCarApi.models.TourThemeTour;
import com.example.RestTravelCarApi.models.TourThemeTourDTO;
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

    public List<TourPackage> getAllTourPackages() {
        return tourPackageRepository.findAll();
    }
    public List<TourCategoryTour> getAllTourPackagesCategory() {
        return tourCategoryTourRepository.findAll();
    }
    public List<TourThemeTour> getAllTourPackagesTheme() {
        return tourThemeTourRepository.findAll();
    }
    public List<TourDepartureDate> getAllTourPackagesDepartureDate() {
        return tourDepartureDateRepository.findAll();
    }
    public List<TourSuitableTour> getAllTourPackagesSuitable() {
        return tourSuitableTourRepository.findAll();
    }
    // public TourResponse getTourResponse(int packageId) {
    //     List<TourCategoryTour> categoryTours = tourCategoryTourRepository.findByPackageId(packageId);
    //     List<CategoryTourDTO> categoryTourDTOs = categoryTours.stream()
    //         .map(t -> new CategoryTourDTO(t.getCategoryTour()))
    //         .collect(Collectors.toList());

    //     List<TourThemeTour> themeTours = tourThemeTourRepository.findByPackageId(packageId);
    //     List<ThemeTourDTO> themeTourDTOs = themeTours.stream()
    //         .map(t -> new ThemeTourDTO(t.getThemeTour()))
    //         .collect(Collectors.toList());

    //     List<TourDepartureDate> departureDates = tourDepartureDateRepository.findByPackageId(packageId);
    //     List<DepartureDateDTO> departureDateDTOs = departureDates.stream()
    //         .map(t -> new DepartureDateDTO(t.getDepartureDate()))
    //         .collect(Collectors.toList());

    //     return new TourResponse(categoryTourDTOs, themeTourDTOs, departureDateDTOs);
    // }

}
