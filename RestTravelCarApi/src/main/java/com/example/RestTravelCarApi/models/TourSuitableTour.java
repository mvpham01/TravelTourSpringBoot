package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "toursuitabletour")
public class TourSuitableTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toursuitabletourid")
    private int toursuitabletourid;

    public int getToursuitabletourid() {
        return this.toursuitabletourid;
    }

    public void setToursuitabletourid(int toursuitabletourid) {
        this.toursuitabletourid = toursuitabletourid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "packageid", referencedColumnName = "packageid")
    private TourPackage packageid;

    public TourPackage getPackageid() {
        return this.packageid;
    }

    public void setPackageid(TourPackage packageid) {
        this.packageid = packageid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "suitabletourid", referencedColumnName = "suitabletourid")
    private SuitableTour suitabletourid;

    public SuitableTour getSuitabletourid() {
        return this.suitabletourid;
    }

    public void setSuitabletourid(SuitableTour suitabletourid) {
        this.suitabletourid = suitabletourid;
    }

}