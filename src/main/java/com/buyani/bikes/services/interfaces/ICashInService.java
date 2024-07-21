package com.buyani.bikes.services.interfaces;

import com.buyani.bikes.models.Bike;
import com.buyani.bikes.models.CashIn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICashInService {
    List<CashIn> allCashIns();
}
