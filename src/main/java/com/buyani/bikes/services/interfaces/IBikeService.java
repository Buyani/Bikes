package com.buyani.bikes.services.interfaces;

import com.buyani.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBikeService {
    List<Bike> allBikes();
}
