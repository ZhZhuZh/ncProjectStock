package com.nc.project.stock.service;

import com.nc.project.stock.model.CompositeKeyForFavoriteStock;
import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.FavoriteStockRepository;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FavoriteStockServiceImpl implements FavoriteStockService {

    private final FavoriteStockRepository repository;

    @Autowired
    public FavoriteStockServiceImpl(FavoriteStockRepository repository) {
        this.repository = repository;
    }

    @Override
    public FavoriteStock getFavoriteStockById(CompositeKeyForFavoriteStock id) {
        return repository.findFavoriteStockById(id);
    }

    /*@Override
    public StockHistory getFavoriteStockBySymbol(String symbol) {
        return repository.findFavoriteStockBySymbol(symbol);
    }*/

    //todo изменить сигнатуру и логику - добавить зависимость от юзера
    @Override
    public List<FavoriteStock> getAllFavoriteStocks(CompositeKeyForFavoriteStock id) {

        List<FavoriteStock> favoriteStocks = new ArrayList<>();

        // todo сделать List

        List<FavoriteStock> favoriteStockByUserId = repository.findFavoriteStockByUserId(id.getUserId());

        while(favoriteStockByUserId != null) {

            favoriteStocks.add(favoriteStockByUserId);

        }

        return favoriteStocks;

    }
}
