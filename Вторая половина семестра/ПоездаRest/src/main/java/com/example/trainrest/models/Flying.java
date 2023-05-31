package com.example.trainrest.models;

import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.OneToOne;

@Entity public class Flying { @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

    private String cityFrom;
    private String cityWhere;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private int basePrice;
    @OneToOne
    private Trains trains;

    public Flying() {

    }

    public Flying(Long id, String cityFrom, String cityWhere, String departureDate, String departureTime,
                  String arrivalDate, String arrivalTime, int basePrice, Trains trains) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityWhere = cityWhere;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.basePrice = basePrice;
        this.trains = trains;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityWhere() {
        return cityWhere;
    }

    public void setCityWhere(String cityWhere) {
        this.cityWhere = cityWhere;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Trains getTrain() {
        return trains;
    }

    public void setTrain(Trains trains) {
        this.trains = trains;
    }
}




