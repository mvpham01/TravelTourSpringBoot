package com.example.RestTravelCarApi.models;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "itinerary")
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itineraryid")
    private int itineraryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packageid", referencedColumnName = "packageid")
    @JsonIgnore
    private TourPackage tourPackage;

    @Column(name = "day")
    private Timestamp day;

    // Getters and setters
    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public Timestamp getDay() {
        return day;
    }

    public void setDay(Timestamp day) {
        this.day = day;
    }
}
