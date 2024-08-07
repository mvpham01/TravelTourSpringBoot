package com.example.RestTravelCarApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.*;


public interface RentalRepository extends JpaRepository<Rental, Integer> {
    // Additional query methods can be defined here
}