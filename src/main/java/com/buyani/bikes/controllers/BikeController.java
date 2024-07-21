package com.buyani.bikes.controllers;
import com.buyani.bikes.models.Bike;
import com.buyani.bikes.models.Rider;
import com.buyani.bikes.services.interfaces.IBikeService;
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
    public List<Bike> Bikes()
    {
        return _bikeService.allBikes();
    };
}
