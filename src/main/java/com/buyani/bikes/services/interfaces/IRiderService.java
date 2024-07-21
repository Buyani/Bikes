package com.buyani.bikes.services.interfaces;

import com.buyani.bikes.models.Bike;
import com.buyani.bikes.models.CashIn;
import com.buyani.bikes.models.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRiderService {
    List<Rider> allRiders();
}
