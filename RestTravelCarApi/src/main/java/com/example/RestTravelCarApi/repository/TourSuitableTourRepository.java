package com.example.RestTravelCarApi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.TourSuitableTour;
import com.example.RestTravelCarApi.models.TourThemeTour;

public interface TourSuitableTourRepository extends JpaRepository<TourSuitableTour, Integer> {
}
