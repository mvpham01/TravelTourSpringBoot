package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activityid")
    private int activityid;

    public int getActivityid() {
        return this.activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itineraryid", referencedColumnName = "itineraryid")
    private Itinerary itineraryid;

    public Itinerary getItineraryid() {
        return this.itineraryid;
    }

    public void setItineraryid(Itinerary itineraryid) {
        this.itineraryid = itineraryid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activitytypeid", referencedColumnName = "activitytypeid")
    private ActivityType activitytypeid;

    public ActivityType getActivitytypeid() {
        return this.activitytypeid;
    }

    public void setActivitytypeid(ActivityType activitytypeid) {
        this.activitytypeid = activitytypeid;
    }

    @Column(name = "activityname")
    private String activityname;

    public String getActivityname() {
        return this.activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "timeperiod")
    private String timeperiod;

    public String getTimeperiod() {
        return this.timeperiod;
    }

    public void setTimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }

    @Column(name = "thumbnail")
    private String thumbnail;

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
