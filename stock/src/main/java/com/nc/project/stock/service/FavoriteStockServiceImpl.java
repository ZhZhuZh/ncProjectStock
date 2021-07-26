package com.nc.project.stock.service;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.FavoriteStockRepository;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavoriteStockServiceImpl implements FavoriteStockService {

    private final FavoriteStockRepository repository;

    @Autowired
    public FavoriteStockServiceImpl(FavoriteStockRepository repository) {
        this.repository = repository;
    }

    @Override
    public StockHistory getFavoriteStockById(Integer id) {
        return repository.findFavoriteStockById(id);
    }

    @Override
    public StockHistory getFavoriteStockBySymbol(String symbol) {
        return repository.findFavoriteStockBySymbol(symbol);
    }

    //todo изменить сигнатуру и логику - добавить зависимость от юзера
    @Override
    public List<FavoriteStock> getAllFavoriteStocks() {
        return repository.findAll();
    }
}
