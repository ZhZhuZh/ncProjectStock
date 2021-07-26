package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;

import java.util.List;

public interface FavoriteStockService {

    StockHistory getFavoriteStockById(Integer id);

    StockHistory getFavoriteStockBySymbol(String symbol);

    List<FavoriteStock> getAllFavoriteStocks();

}
