package com.buyani.bikes.services.implementations.seedData;

import com.buyani.bikes.models.Bike;
import com.buyani.bikes.repositories.IBikeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BikeConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(IBikeRepository bikeRepository)
    {
        return args -> {
            Bike Yamaha = new Bike("Yamaha", "XYZ456", 2000);
            Bike Honda = new Bike("Honda", "ABC123", 5000);
            Bike Kawasaki = new Bike("Kawasaki", "DEF789", 3000);
            Bike Suzuki = new Bike("Suzuki", "GHI321", 4000);
            Bike Ducati = new Bike("Ducati", "JKL987", 6000);
            
            bikeRepository.saveAll(List.of(Yamaha,Honda,Kawasaki,Suzuki,Ducati));
        };
    }
}
