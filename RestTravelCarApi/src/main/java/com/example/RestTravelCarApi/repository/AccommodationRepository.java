package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestTravelCarApi.models.Entity.Accommodation;

public interface AccommodationRepository extends JpaRepository<Accommodation, Integer> {

}
