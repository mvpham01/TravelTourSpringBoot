package com.example.RestTravelCarApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestTravelCarApi.models.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
