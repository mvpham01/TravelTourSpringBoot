package com.example.RestTravelCarApi.repository;
import com.example.RestTravelCarApi.models.Car;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends JpaRepository<Car, Integer> {
   @Query("SELECT c FROM Car c LEFT JOIN FETCH c.model LEFT JOIN FETCH c.make LEFT JOIN FETCH c.type WHERE c.carId = :id")
    Optional<Car> findById(@Param("id") int id);
}