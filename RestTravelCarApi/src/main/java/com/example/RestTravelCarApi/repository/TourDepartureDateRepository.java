package com.example.RestTravelCarApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.TourDepartureDate;
import com.example.RestTravelCarApi.models.TourSuitableTour;

@Repository
public interface TourDepartureDateRepository extends JpaRepository<TourDepartureDate, Integer> {
          List<TourDepartureDate> findByPackageId(int packageId);
}