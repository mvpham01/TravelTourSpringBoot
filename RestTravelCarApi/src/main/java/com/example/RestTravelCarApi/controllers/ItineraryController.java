package com.example.RestTravelCarApi.controllers;

import com.example.RestTravelCarApi.models.DTO.ItineraryDTO;
import com.example.RestTravelCarApi.models.Entity.Itinerary;
import com.example.RestTravelCarApi.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryController {

    @Autowired
    private ItineraryService itineraryService;

    @PostMapping("/createOrUpdate")
    public ResponseEntity<Itinerary> createOrUpdateItinerary(@RequestBody ItineraryDTO itineraryDTO) {
        Itinerary itinerary = itineraryService.createOrUpdateItinerary(itineraryDTO);
        return ResponseEntity.ok(itinerary);
    }
}
