package com.buyani.bikes.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table
public class Bike {
    @Id
    @SequenceGenerator(name = "bike_sequence",
            sequenceName = "bike_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "bike_sequence")

    private Long id;
    private String make ;
    private String plateNumber ;
    private int kilometers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rider_id")
    private Rider rider;

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public  Bike(){}

    public Bike(Long id,String make, String plateNumber, int kilometers) {
        this.make = make;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.id=id;
    }
    public Bike(String make, String plateNumber, int kilometers) {
        this.make = make;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
    }

    public Long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getKilometers() {
        return kilometers;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    
}
