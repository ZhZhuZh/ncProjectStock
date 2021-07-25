package com.nc.project.stock.repository;

import com.nc.project.stock.model.StockHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<StockHistory, Integer> {

    StockHistory findStockById(Integer id);
    StockHistory findStockByStockName(String stockName);

}
