package com.buyani.bikes.services.implementations;

import com.buyani.bikes.models.dao.CashIn;
import com.buyani.bikes.repositories.ICashInRepository;
import com.buyani.bikes.services.interfaces.ICashInService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashInService implements ICashInService {
    
    private final ICashInRepository _cashInRepository;
    
    public CashInService(ICashInRepository cashInRepository){
        _cashInRepository=cashInRepository;
    }
        
    @Override
    public List<CashIn> allCashIns() {
        return _cashInRepository.findAll();
    }
}
 