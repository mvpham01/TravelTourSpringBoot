package com.example.RestTravelCarApi.repository;

import com.example.RestTravelCarApi.models.Type;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface TypeRepository  extends JpaRepository<Type, Integer>{
    Optional<Type> findByTypeName(String typeName);
}
