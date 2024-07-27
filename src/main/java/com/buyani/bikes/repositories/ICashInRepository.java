package com.buyani.bikes.repositories;

import com.buyani.bikes.models.dao.CashIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICashInRepository  extends JpaRepository<CashIn,Long> {
}