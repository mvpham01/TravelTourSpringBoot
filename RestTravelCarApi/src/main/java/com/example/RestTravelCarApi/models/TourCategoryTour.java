package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tourcategorytour")
public class TourCategoryTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourcategorytourid")
    private int tourCategoryTourId;

    public int getTourCategoryTourId() {
        return this.tourCategoryTourId;
    }

    public void setTourCategoryTourId(int tourCategoryTourId) {
        this.tourCategoryTourId = tourCategoryTourId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packageid", referencedColumnName = "packageid")
    private TourPackage tourPackage;

    public TourPackage getTourPackage() {
        return this.tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorytourid", referencedColumnName = "categorytourid")
    private CategoryTour categoryTour;

    public CategoryTour getCategoryTour() {
        return this.categoryTour;
    }

    public void setCategoryTour(CategoryTour categoryTour) {
        this.categoryTour = categoryTour;
    }

    // Getters and setters
}