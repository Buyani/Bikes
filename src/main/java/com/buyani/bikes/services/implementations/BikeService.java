package com.buyani.bikes.services.implementations;

import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;
import com.buyani.bikes.repositories.IBikeRepository;
import com.buyani.bikes.services.interfaces.IBikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
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
               bike.getMake(),
               bike.getPlateNumber(),
               bike.getKilometers())).collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<BikeDTO> registerBike(BikeDTO bikeDto) {
        try{
            _bikeRepository.save(new Bike(bikeDto.make()
                    ,bikeDto.plateNumber(),
                    bikeDto.kilometers()));

            return new ResponseEntity<>(bikeDto, HttpStatus.CREATED);
        }
        catch(Exception ex)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
