package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.Itinerary;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, Integer> {
}