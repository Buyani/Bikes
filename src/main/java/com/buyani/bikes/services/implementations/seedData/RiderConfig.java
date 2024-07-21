package com.buyani.bikes.services.implementations.seedData;

import com.buyani.bikes.models.Bike;
import com.buyani.bikes.models.Rider;
import com.buyani.bikes.repositories.IBikeRepository;
import com.buyani.bikes.repositories.IRiderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class RiderConfig {
    @Bean
    CommandLineRunner commandLineRunner(IRiderRepository riderRepository)
    {
        return args -> {
            Rider john = new Rider("John", "Doe", "ID001");
            Rider sipho = new Rider("Sipho", "Mkhize", "ID002");
            Rider daniel = new Rider("Daniel", "Nguyen", "ID003");
            Rider pretric = new Rider("Pretric", "Lopez", "ID004");
            Rider david = new Rider("David", "Smith", "ID005");
            riderRepository.saveAll(List.of(john,sipho,pretric,daniel,david));
        };
    }
}
