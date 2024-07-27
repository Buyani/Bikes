package com.buyani.bikes.repositories;

import com.buyani.bikes.models.dao.Bike;
import com.buyani.bikes.models.dto.BikeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBikeRepository extends JpaRepository<Bike,Long> {
}