package com.buyani.bikes.repositories;

import com.buyani.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBikeRepository extends JpaRepository<Bike,Long> {
}