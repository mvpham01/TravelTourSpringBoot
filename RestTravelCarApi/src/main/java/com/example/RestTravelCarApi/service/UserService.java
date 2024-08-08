package com.example.RestTravelCarApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.RestTravelCarApi.models.*;
import com.example.RestTravelCarApi.models.Entity.User;
import com.example.RestTravelCarApi.repository.*;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
