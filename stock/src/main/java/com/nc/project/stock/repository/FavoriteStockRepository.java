package com.nc.project.stock.repository;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavoriteStockRepository extends MongoRepository<FavoriteStock, Integer> {

    StockHistory findFavoriteStockById(Integer id);
    StockHistory findFavoriteStockBySymbol(String symbol);

}
