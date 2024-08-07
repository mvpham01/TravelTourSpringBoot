package com.example.RestTravelCarApi.models;

public class TourDepartureDateDTO {

    private int tourDepartureDateId;
    private int packageId;  // Use int for ID
    private int departureDateId;  // Use int for ID

    // Getters and setters
    public int getTourDepartureDateId() {
        return tourDepartureDateId;
    }

    public void setTourDepartureDateId(int tourDepartureDateId) {
        this.tourDepartureDateId = tourDepartureDateId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getDepartureDateId() {
        return departureDateId;
    }

    public void setDepartureDateId(int departureDateId) {
        this.departureDateId = departureDateId;
    }
}
