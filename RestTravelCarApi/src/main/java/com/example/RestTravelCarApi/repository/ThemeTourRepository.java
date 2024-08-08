package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.Entity.ThemeTour;

@Repository
public interface ThemeTourRepository extends JpaRepository<ThemeTour, Integer> {
    
}