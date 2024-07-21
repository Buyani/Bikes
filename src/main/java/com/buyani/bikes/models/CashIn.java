package com.buyani.bikes.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class CashIn {
    @Id
    @SequenceGenerator(name = "cashIn_sequence",
            sequenceName = "cashIn_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "cashIn_sequence")

    private Long id;
    private LocalDate date;
    private boolean late;
    private  double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rider_id")
    private Rider rider;

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public  CashIn(){}
    public CashIn(LocalDate date, boolean late, double amount) {
        this.date = date;
        this.late = late;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isLate() {
        return late;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
