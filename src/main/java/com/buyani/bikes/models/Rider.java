package com.buyani.bikes.models;

import jakarta.persistence.*;

import java.util.List;

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
