package com.example.RestTravelCarApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.RestTravelCarApi.models.DTO.TourPackageDetailDTO;
import com.example.RestTravelCarApi.models.Entity.TourCategoryTour;
import com.example.RestTravelCarApi.models.Entity.TourPackage;
import com.example.RestTravelCarApi.service.PackTourService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/tours")
public class PackTourController {
    @Autowired
    private PackTourService packTourService;

    @GetMapping
    public List<TourPackage> getAllTourPackages() {
        return packTourService.getAllTourPackages();
    }

    @GetMapping("/{packageid}")
    // @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public TourPackageDetailDTO getToursByPackageId(@PathVariable int packageid) {
        return packTourService.getTourDetailByPackageid(packageid);
    }

    @GetMapping("/category")
    public List<TourCategoryTour> getAllTourPackagesCategory() {
        return packTourService.getAllTourPackagesCategory();
    }
    @GetMapping("/category/{categoryTourName}")
    public List<TourPackage> getToursByCategory(@PathVariable String categoryTourName) {
        return  packTourService.getAllTourPackagesByCategory(categoryTourName);
    }

    @GetMapping("/theme/{themeTourName}")
    public List<TourPackage> getToursByThemeTourName(@RequestParam String themeTourName) {
        return packTourService.getToursByThemeTourName(themeTourName);
    }

    @GetMapping("/theme/{suitableName}")
    public List<TourPackage> getToursBySuitableName(@RequestParam String suitableName) {
        return packTourService.getToursBySuitableName(suitableName);
    }
    // @GetMapping("/category/{packageid}")
    // public List<TourCategoryTourDTO> getToursCatByPackageId(@PathVariable int
    // packageid) {
    // return packTourService.getToursCategoryByPackageId(packageid);
    // }
    // @GetMapping("/{packageId}")
    // public ResponseEntity<TourResponse> getTourDetails(@PathVariable int
    // packageId) {
    // TourResponse tourResponse = packTourService.getTourResponse(packageId);
    // return ResponseEntity.ok(tourResponse);
    // }
}