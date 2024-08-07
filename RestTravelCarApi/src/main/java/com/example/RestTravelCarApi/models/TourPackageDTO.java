package com.example.RestTravelCarApi.models;

import java.math.BigDecimal;
import java.util.List;

public class TourPackageDTO {

    private int packageId;
    private String title;
    private String thumbnail;
    private BigDecimal price;
    private BigDecimal priceReduce;
    private String groupSize;
    private String deposit;
    private String bookingHold;
    private String bookingChange;
    private List<ItineraryDTO> itineraries;
    private List<TourCategoryTourDTO> categoryTours;
    private List<TourThemeTourDTO> themeTours;
    private List<TourDepartureDateDTO> departureDates;

    // Getters and setters
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceReduce() {
        return priceReduce;
    }

    public void setPriceReduce(BigDecimal priceReduce) {
        this.priceReduce = priceReduce;
    }

    public String getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(String groupSize) {
        this.groupSize = groupSize;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getBookingHold() {
        return bookingHold;
    }

    public void setBookingHold(String bookingHold) {
        this.bookingHold = bookingHold;
    }

    public String getBookingChange() {
        return bookingChange;
    }

    public void setBookingChange(String bookingChange) {
        this.bookingChange = bookingChange;
    }

    public List<ItineraryDTO> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<ItineraryDTO> itineraries) {
        this.itineraries = itineraries;
    }

    public List<TourCategoryTourDTO> getCategoryTours() {
        return categoryTours;
    }

    public void setCategoryTours(List<TourCategoryTourDTO> categoryTours) {
        this.categoryTours = categoryTours;
    }

    public List<TourThemeTourDTO> getThemeTours() {
        return themeTours;
    }

    public void setThemeTours(List<TourThemeTourDTO> themeTours) {
        this.themeTours = themeTours;
    }

    public List<TourDepartureDateDTO> getDepartureDates() {
        return departureDates;
    }

    public void setDepartureDates(List<TourDepartureDateDTO> departureDates) {
        this.departureDates = departureDates;
    }
}