package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.Entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer>{}
    

