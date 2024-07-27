package com.buyani.bikes.models.dao;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table
public class Rider {
    @Id
    @SequenceGenerator(name = "rider_sequence",
            sequenceName = "rider_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "rider_sequence")

    private Long id;
    private String name;
    private String lastName;
    private String  idNumber;

    @OneToMany(mappedBy = "rider")
    private Set<Address> addresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "rider")
    private Set<Bike> bikes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "rider")
    private Set<CashIn> cashIns = new LinkedHashSet<>();

    public Set<CashIn> getCashIns() {
        return cashIns;
    }

    public void setCashIns(Set<CashIn> cashIns) {
        this.cashIns = cashIns;
    }

    public Set<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(Set<Bike> bikes) {
        this.bikes = bikes;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public  Rider(){}

    public Rider(String name, String lastName, String idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
}
