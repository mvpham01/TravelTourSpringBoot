package com.example.RestTravelCarApi.models;

public class ThemeTourDTO {
    private int themeTourId;
    private String themeTourName;

    // Constructor
    public ThemeTourDTO(ThemeTour themeTour) {
        this.themeTourId = themeTour.getThemeTourId();
        this.themeTourName = themeTour.getThemeTourName();
    }

    // Getters and setters
    public int getThemeTourId() {
        return themeTourId;
    }

    public void setThemeTourId(int themeTourId) {
        this.themeTourId = themeTourId;
    }

    public String getThemeTourName() {
        return themeTourName;
    }

    public void setThemeTourName(String themeTourName) {
        this.themeTourName = themeTourName;
    }
}
