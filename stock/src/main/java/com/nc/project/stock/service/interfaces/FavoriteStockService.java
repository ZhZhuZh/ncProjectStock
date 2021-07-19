package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;

import java.util.List;

public interface FavoriteStockService {

    Stock getFavoriteStockById(Integer id);

    Stock getFavoriteStockByStockName(String stockName);

    List<FavoriteStock> getAllFavoriteStocks();

}
