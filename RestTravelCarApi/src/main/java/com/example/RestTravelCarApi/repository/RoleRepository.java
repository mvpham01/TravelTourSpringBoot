package com.example.RestTravelCarApi.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestTravelCarApi.models.*;
import com.example.RestTravelCarApi.models.Entity.ERole;
import com.example.RestTravelCarApi.models.Entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{
Optional<Role> findByRoleName(ERole roleName);
}
