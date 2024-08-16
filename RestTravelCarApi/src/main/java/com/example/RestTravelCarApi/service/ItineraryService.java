package com.example.RestTravelCarApi.service;

import com.example.RestTravelCarApi.models.Entity.*;
import com.example.RestTravelCarApi.models.DTO.ItineraryDTO;
import com.example.RestTravelCarApi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItineraryService {

    @Autowired
    private ItineraryRepository itineraryRepository;

    @Autowired
    private TourPackageRepository tourPackageRepository;

    @Autowired
    private AccommodationRepository accommodationRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private PlaceRepository placeRepository;

    public Itinerary createOrUpdateItinerary(ItineraryDTO itineraryDTO) {
        Optional<Itinerary> optionalItinerary = itineraryRepository.findById(itineraryDTO.getItineraryId());
        Itinerary itinerary;

        if (optionalItinerary.isPresent()) {
            itinerary = optionalItinerary.get();
        } else {
            itinerary = new Itinerary();
        }

        Optional<TourPackage> optionalTourPackage = tourPackageRepository.findById(itineraryDTO.getTourPackageId());
        optionalTourPackage.ifPresent(itinerary::setTourPackage);

        List<Accommodation> accommodations = accommodationRepository.findAllById(itineraryDTO.getAccommodationIds());
        itinerary.setAccommodations(accommodations);

        List<Meal> meals = mealRepository.findAllById(itineraryDTO.getMealIds());
        itinerary.setMeals(meals);

        List<Place> places = placeRepository.findAllById(itineraryDTO.getPlaceIds());
        itinerary.setPlaces(places);

        itinerary.setDay(itineraryDTO.getDay());

        return itineraryRepository.save(itinerary);
    }
}
