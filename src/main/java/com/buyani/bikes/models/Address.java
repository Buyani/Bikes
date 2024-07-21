package com.buyani.bikes.models;


import jakarta.persistence.*;

@Entity
@Table
public class Address {
    @Id
    @SequenceGenerator(name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "address_sequence")
    
    private Long id;
    private String streetName;
    private String cityName;
    private int streetNumber;
    
    public Address(){}
    public Address(String streetName, String cityName, int streetNumber) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.streetNumber = streetNumber;
    }

    public Long getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }


    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

}
