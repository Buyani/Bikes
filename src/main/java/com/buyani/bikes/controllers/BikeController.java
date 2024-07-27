package com.buyani.bikes.controllers;
import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;
import com.buyani.bikes.services.interfaces.IBikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bike")
public class BikeController {

    private final IBikeService _bikeService;
    public  BikeController(IBikeService bikeService)
    {
        _bikeService=bikeService;
    }
    @GetMapping
    public ResponseEntity<List<BikeDTO>> Bikes()
    {
        try {
            var bikes= _bikeService.allBikes();
            return new ResponseEntity<>(bikes, HttpStatus.OK);
        }
        catch(Exception ex)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
       
    };
    
    @PostMapping
    public ResponseEntity<BikeDTO> RegisterBike(@RequestBody BikeDTO bikeDto)
    {
        try{
            var savedBike = _bikeService.registerBike(bikeDto);

            return new ResponseEntity<>(bikeDto, HttpStatus.CREATED);
        }
        catch(Exception ex)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
