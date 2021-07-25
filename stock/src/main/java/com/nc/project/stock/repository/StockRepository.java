package com.nc.project.stock.repository;

import com.nc.project.stock.model.Stock;
import com.nc.project.stock.model.StockHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, Integer> {

    Stock findStockById(Integer id);
    Stock findStockByStockName(String stockName);

}
