package com.buyani.bikes.controllers;
import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dao.Rider;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/rider")
public class RiderController {
    
    public  RiderController(){
        
    }
    
    @GetMapping
    public List<Bike> Bikes()
    {
        return  null;
    }
    @PostMapping
    public void registerRider(@RequestBody Rider rider)
    {

    }
}
