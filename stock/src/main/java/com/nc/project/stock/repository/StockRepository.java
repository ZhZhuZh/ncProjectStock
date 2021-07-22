package com.nc.project.stock.repository;

import com.nc.project.stock.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface StockRepository extends MongoRepository<Stock, Integer> {

    Stock findStockById(Integer id);
    Stock findStockByStockName(String stockName);

}
