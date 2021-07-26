package com.nc.project.stock.repository;

import com.nc.project.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    Stock findStockById(Integer id);
    Stock findStockBySymbol(String symbol);

}
