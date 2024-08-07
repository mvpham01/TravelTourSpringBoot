package com.example.RestTravelCarApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestTravelCarApi.models.TourCategoryTour;
import com.example.RestTravelCarApi.models.TourPackage;
import com.example.RestTravelCarApi.models.TourPackageDTO;
import com.example.RestTravelCarApi.models.TourResponse;
import com.example.RestTravelCarApi.service.PackTourService;

@RestController
@RequestMapping("/api/tours")
public class PackTourController {
    @Autowired
    private PackTourService packTourService;


    @GetMapping
    public List<TourPackage> getAllTourPackages() {
        return packTourService.getAllTourPackages();
    }
    @GetMapping("/category")
    public List<TourCategoryTour> getAllTourPackagesCategory() {
        return packTourService.getAllTourPackagesCategory();
    }
    // @GetMapping("/{packageId}")
    // public ResponseEntity<TourResponse> getTourDetails(@PathVariable int packageId) {
    //     TourResponse tourResponse = packTourService.getTourResponse(packageId);
    //     return ResponseEntity.ok(tourResponse);
    // }
}