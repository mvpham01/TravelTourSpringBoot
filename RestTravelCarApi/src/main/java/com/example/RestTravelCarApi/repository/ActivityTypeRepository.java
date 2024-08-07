package com.example.RestTravelCarApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.ActivityType;

@Repository
public interface ActivityTypeRepository extends JpaRepository<ActivityType, Integer> {
}