package com.example.RestTravelCarApi.models;

public class TourThemeTourDTO {
    private int tourThemeTourId;
    private int packageId;
    private int themeTourId;

    // Getters and setters
    public int getTourThemeTourId() {
        return tourThemeTourId;
    }

    public void setTourThemeTourId(int tourThemeTourId) {
        this.tourThemeTourId = tourThemeTourId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getThemeTourId() {
        return themeTourId;
    }

    public void setThemeTourId(int themeTourId) {
        this.themeTourId = themeTourId;
    }
}
