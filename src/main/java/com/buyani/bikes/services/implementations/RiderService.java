package com.buyani.bikes.services.implementations;

import com.buyani.bikes.models.dao.Rider;
import com.buyani.bikes.repositories.IRiderRepository;
import com.buyani.bikes.services.interfaces.IRiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderService implements IRiderService {

    private final IRiderRepository _riderRepository;

    public RiderService(IRiderRepository riderRepository){
        _riderRepository=riderRepository;
    }
    @Override
    public List<Rider> allRiders() {
        return _riderRepository.findAll();
    }
}
