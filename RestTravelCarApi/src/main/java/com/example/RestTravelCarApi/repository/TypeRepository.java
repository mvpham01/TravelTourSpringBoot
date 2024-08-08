package com.example.RestTravelCarApi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestTravelCarApi.models.Entity.Type;
public interface TypeRepository  extends JpaRepository<Type, Integer>{
    Optional<Type> findByTypeName(String typeName);
}
