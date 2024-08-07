package com.example.RestTravelCarApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.TourPackage;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, Integer> {
}