package com.buyani.bikes.repositories;

import com.buyani.bikes.models.CashIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICashInRepository  extends JpaRepository<CashIn,Long> {
}