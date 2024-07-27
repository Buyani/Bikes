package com.buyani.bikes.services.interfaces;

import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBikeService {
    List<BikeDTO> allBikes();
    ResponseEntity<BikeDTO> registerBike(BikeDTO bikeDto);
}
