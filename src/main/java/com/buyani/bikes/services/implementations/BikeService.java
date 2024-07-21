package com.buyani.bikes.services.implementations;

import com.buyani.bikes.models.Bike;
import com.buyani.bikes.repositories.IBikeRepository;
import com.buyani.bikes.services.interfaces.IBikeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService implements IBikeService {
    private final IBikeRepository _bikeRepository;
    
    public BikeService(IBikeRepository bikeRepository)
    {
        _bikeRepository=bikeRepository;
    }
    @Override
    public List<Bike> allBikes() {
        return _bikeRepository.findAll();
    }
    
}
