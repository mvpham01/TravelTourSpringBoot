package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestTravelCarApi.models.Entity.Meal;

public interface MealRepository extends JpaRepository<Meal, Integer> {
    
}
