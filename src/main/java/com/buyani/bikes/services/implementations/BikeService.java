package com.buyani.bikes.services.implementations;

import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;
import com.buyani.bikes.repositories.IBikeRepository;
import com.buyani.bikes.services.interfaces.IBikeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BikeService implements IBikeService {
    private final IBikeRepository _bikeRepository;
    
    public BikeService(IBikeRepository bikeRepository)
    {
        _bikeRepository=bikeRepository;
    }
    @Override
    public List<BikeDTO> allBikes() {
       return _bikeRepository.findAll().stream().map(bike -> new BikeDTO(
               bike.getId(),
               bike.getMake(),
               bike.getPlateNumber(),
               bike.getKilometers())).collect(Collectors.toList());
    }

    @Override
    public BikeDTO registerBike(BikeDTO bikeDto) {
        _bikeRepository.save(new Bike(bikeDto.make()
                ,bikeDto.plateNumber(),
                bikeDto.kilometers()));
        
        return bikeDto;
    }

    @Override
    public BikeDTO getBike(Long bikeId) {
        Bike bike = _bikeRepository.findById(bikeId).orElse(null);
        
        if(bike==null)
        {
            return  null;
        }
        return new BikeDTO(
        bike.getId(),
        bike.getMake(),
        bike.getPlateNumber(),
        bike.getKilometers());
    }
}
