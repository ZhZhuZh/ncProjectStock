package com.nc.project.stock.repository;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavoriteStockRepository extends MongoRepository<FavoriteStock, Integer> {

    Stock findFavoriteStockById(Integer id);
    Stock findFavoriteStockByStockName(String stockName);

}
