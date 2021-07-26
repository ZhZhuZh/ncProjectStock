package com.nc.project.stock.repository;

import com.nc.project.stock.model.StockHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockHistoryRepository extends MongoRepository<StockHistory, Integer> {

    StockHistory findStockHistoryBySymbol(String symbol);

}
