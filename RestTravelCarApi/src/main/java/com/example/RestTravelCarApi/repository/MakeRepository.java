package com.example.RestTravelCarApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestTravelCarApi.models.Entity.Make;


public interface MakeRepository extends JpaRepository<Make, Integer>{
    Optional<Make> findByMakeName(String makeName);
    
} 