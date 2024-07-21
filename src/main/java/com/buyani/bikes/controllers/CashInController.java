package com.buyani.bikes.controllers;
import com.buyani.bikes.models.CashIn;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cashIn")
public class CashInController {
    
    public  CashInController(){
    }
    
    @GetMapping
    public List<CashIn> cashIns()
    {
        return  null;
    }
    @PostMapping
    public void registerCashIn(@RequestBody CashIn cashIn)
    {

    }
}
