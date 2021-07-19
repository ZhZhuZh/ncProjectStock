package com.nc.project.stock.repository;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteStockRepository extends JpaRepository<FavoriteStock, Integer> {

    Stock findFavoriteStockById(Integer id);
    Stock findFavoriteStockByStockName(String stockName);

}
