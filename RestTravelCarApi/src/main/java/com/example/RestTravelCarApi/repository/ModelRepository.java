package com.example.RestTravelCarApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>{
    Optional<Model> findByModelName(String modelName);

}
