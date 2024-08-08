package com.example.RestTravelCarApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.RestTravelCarApi.models.*;
import com.example.RestTravelCarApi.models.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,  Integer> {
}
