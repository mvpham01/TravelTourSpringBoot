package com.example.RestTravelCarApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.*;
import com.example.RestTravelCarApi.models.Entity.Rental;


public interface RentalRepository extends JpaRepository<Rental, Integer> {
    // Additional query methods can be defined here
}