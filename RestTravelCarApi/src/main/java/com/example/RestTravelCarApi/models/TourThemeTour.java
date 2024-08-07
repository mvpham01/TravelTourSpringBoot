package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tourthemetour")
public class TourThemeTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourthemetourid")
    private int tourThemeTourId;

    @Column(name = "packageid")
    private int packageId;

    public int getPackageId() {
        return this.packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "themetourid", referencedColumnName = "themetourid")
    private ThemeTour themeTour;

    // Getters and setters
    public int getTourThemeTourId() {
        return tourThemeTourId;
    }

    public void setTourThemeTourId(int tourThemeTourId) {
        this.tourThemeTourId = tourThemeTourId;
    }

   

    public ThemeTour getThemeTour() {
        return themeTour;
    }

    public void setThemeTour(ThemeTour themeTour) {
        this.themeTour = themeTour;
    }
}