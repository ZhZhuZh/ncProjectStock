package com.nc.project.stock.repository;

import com.nc.project.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, Integer> {

    //todo закончить переход на MongoDB
    Stock findStockById(Integer id);
    Stock findStockByStockName(String stockName);

}
