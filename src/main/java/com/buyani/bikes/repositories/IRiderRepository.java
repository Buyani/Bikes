package com.buyani.bikes.repositories;

import com.buyani.bikes.models.dao.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRiderRepository extends JpaRepository<Rider,Long> {
}
