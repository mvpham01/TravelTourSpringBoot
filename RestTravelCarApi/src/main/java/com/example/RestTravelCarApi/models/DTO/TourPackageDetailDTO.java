package com.example.RestTravelCarApi.models.DTO;

import java.math.BigDecimal;
import java.util.List;


    
    public class TourPackageDetailDTO {
        private int packageid;
    private String title;
    private String thumbnail;
    private BigDecimal price;
    private BigDecimal pricereduce;
    private String groupsize;
    private String deposit;
    private String bookinghold;
    private String bookingchange;
    private List<ItineraryDTO> itineraries;
    private List<TourCategoryTourDTO> categoryTours;
    private List<ThemeTourDTO> themeTours;
    private List<TourDepartureDateDTO> departureDates;
    private List<TourSuitableTourDTO> suitableTours;

    public List<TourSuitableTourDTO> getSuitableTours() {
        return this.suitableTours;
    }

    public void setSuitableTours(List<TourSuitableTourDTO> suitableTours) {
        this.suitableTours = suitableTours;
    }

    public List<ThemeTourDTO> getThemeTours() {
        return this.themeTours;
    }

    public void setThemeTours(List<ThemeTourDTO> themeTours) {
        this.themeTours = themeTours;
    }

    public List<TourDepartureDateDTO> getDepartureDates() {
        return this.departureDates;
    }

    public void setDepartureDates(List<TourDepartureDateDTO> departureDates) {
        this.departureDates = departureDates;
    }
    
        // Getters and setters
        public int getPackageid() {
            return packageid;
        }
    
        public void setPackageid(int packageid) {
            this.packageid = packageid;
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
    
        public BigDecimal getPricereduce() {
            return pricereduce;
        }
    
        public void setPricereduce(BigDecimal pricereduce) {
            this.pricereduce = pricereduce;
        }
    
        public String getGroupsize() {
            return groupsize;
        }
    
        public void setGroupsize(String groupsize) {
            this.groupsize = groupsize;
        }
    
        public String getDeposit() {
            return deposit;
        }
    
        public void setDeposit(String deposit) {
            this.deposit = deposit;
        }
    
        public String getBookinghold() {
            return bookinghold;
        }
    
        public void setBookinghold(String bookinghold) {
            this.bookinghold = bookinghold;
        }
    
        public String getBookingchange() {
            return bookingchange;
        }
    
        public void setBookingchange(String bookingchange) {
            this.bookingchange = bookingchange;
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

       
    }
