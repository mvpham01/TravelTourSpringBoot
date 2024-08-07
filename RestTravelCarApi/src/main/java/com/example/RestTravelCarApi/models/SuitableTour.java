package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "SuitableTour")
public class SuitableTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suitabletourid")
    private int suitabletourid;

    public int getSuitabletourid() {
        return this.suitabletourid;
    }

    public void setSuitabletourid(int suitabletourid) {
        this.suitabletourid = suitabletourid;
    }

    @Column(name = "suitablename")
    private String suitablename;

    public String getSuitablename() {
        return this.suitablename;
    }

    public void setSuitablename(String suitablename) {
        this.suitablename = suitablename;
    }

}