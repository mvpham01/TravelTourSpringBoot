package com.example.RestTravelCarApi.models;

public class TourCategoryTourDTO {

    private int tourCategoryTourId;
    private int packageId;
    private int categoryTourId;

    // Getters and setters
    public int getTourCategoryTourId() {
        return tourCategoryTourId;
    }

    public void setTourCategoryTourId(int tourCategoryTourId) {
        this.tourCategoryTourId = tourCategoryTourId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getCategoryTourId() {
        return categoryTourId;
    }

    public void setCategoryTourId(int categoryTourId) {
        this.categoryTourId = categoryTourId;
    }
}