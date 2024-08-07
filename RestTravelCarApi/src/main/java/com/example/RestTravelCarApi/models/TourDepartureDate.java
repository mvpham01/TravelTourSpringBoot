package com.example.RestTravelCarApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tourdeparturedate")
public class TourDepartureDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourdeparturedateid")
    private int tourdeparturedateid;

    public int getTourdeparturedateid() {
        return this.tourdeparturedateid;
    }

    public void setTourdeparturedateid(int tourdeparturedateid) {
        this.tourdeparturedateid = tourdeparturedateid;
    }

    @Column(name = "packageid")
    private int packageId;

    public int getPackageId() {
        return this.packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "departuredateid", referencedColumnName = "departuredateid")
private DepartureDate departureDate;



public DepartureDate getDepartureDate() {
    return departureDate;
}

public void setDepartureDate(DepartureDate departureDate) {
    this.departureDate = departureDate;
}

}