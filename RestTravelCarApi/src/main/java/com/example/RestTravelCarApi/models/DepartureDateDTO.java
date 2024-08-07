package com.example.RestTravelCarApi.models;

public class DepartureDateDTO {
    private int departureDateId;
    private String departureDate;

    // Constructor
    public DepartureDateDTO(DepartureDate departureDate) {
        this.departureDateId = departureDate.getDeparturedateid();
        this.departureDate = departureDate.getDeparture_date();
    }

    // Getters and setters
    public int getDepartureDateId() {
        return departureDateId;
    }

    public void setDepartureDateId(int departureDateId) {
        this.departureDateId = departureDateId;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}

