package com.example.RestTravelCarApi.models;
public class CategoryTourDTO {
    private int categoryTourId;
    private String categoryTourName;

    public int getCategoryTourId() {
        return this.categoryTourId;
    }

    public void setCategoryTourId(int categoryTourId) {
        this.categoryTourId = categoryTourId;
    }

    public String getCategoryTourName() {
        return this.categoryTourName;
    }

    public void setCategoryTourName(String categoryTourName) {
        this.categoryTourName = categoryTourName;
    }

    // other fields if needed

    public CategoryTourDTO(CategoryTour categoryTour) {
        this.categoryTourId = categoryTour.getCategoryTourId();
        this.categoryTourName = categoryTour.getCategoryTourName();
        // populate other fields
    }

    // Getters and setters
}