package com.example.RestTravelCarApi.models.DTO;

import java.sql.Timestamp;

public class ItineraryDTO {

    private int itineraryId;
    private int packageId; // Reference to the TourPackage
    private Timestamp day;

    // Getters and setters
    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public Timestamp getDay() {
        return day;
    }

    public void setDay(Timestamp day) {
        this.day = day;
    }
}