package com.example.RestTravelCarApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.Entity.CategoryTour;

@Repository
public interface CategoryTourRepository extends JpaRepository<CategoryTour, Integer> {
    List<CategoryTour> findByCategoryTourNameIn(List<String> categoryTourNames);
}