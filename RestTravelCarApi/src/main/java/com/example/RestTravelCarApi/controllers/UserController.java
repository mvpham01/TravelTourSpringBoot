package com.example.RestTravelCarApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestTravelCarApi.models.DTO.ApiResponse;
import com.example.RestTravelCarApi.models.Entity.User;
import com.example.RestTravelCarApi.service.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<ApiResponse<List<User>>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        ApiResponse<List<User>> response = new ApiResponse<>(users, "success", "Users retrieved successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

