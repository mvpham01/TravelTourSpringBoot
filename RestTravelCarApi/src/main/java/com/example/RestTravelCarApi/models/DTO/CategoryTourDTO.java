package com.example.RestTravelCarApi.models.DTO;

import com.example.RestTravelCarApi.models.Entity.CategoryTour;

public class CategoryTourDTO {
    private int categoryTourId;
    private String categoryTourName;

    // Getters and setters
    public int getCategoryTourId() {
        return categoryTourId;
    }

    public void setCategoryTourId(int categoryTourId) {
        this.categoryTourId = categoryTourId;
    }

    public String getCategoryTourName() {
        return categoryTourName;
    }

    public void setCategoryTourName(String categoryTourName) {
        this.categoryTourName = categoryTourName;
    }
}