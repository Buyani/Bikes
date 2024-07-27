package com.buyani.bikes.services.interfaces;

import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;

import java.util.List;
import java.util.Optional;

public interface IBikeService {
    List<BikeDTO> allBikes();
    BikeDTO registerBike(BikeDTO bikeDto);
    BikeDTO getBike(Long bikeId);
}
