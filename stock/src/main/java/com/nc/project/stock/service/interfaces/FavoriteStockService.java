package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.CompositeKeyForFavoriteStock;
import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.model.User;

import java.util.List;

public interface FavoriteStockService {

    FavoriteStock getFavoriteStockById(CompositeKeyForFavoriteStock id);

    // look favoriteStockRepository
    // StockHistory getFavoriteStockBySymbol(String symbol);

    List<FavoriteStock> getAllFavoriteStocks(CompositeKeyForFavoriteStock id);

    List<FavoriteStock> getStockByUser(User user);
}
