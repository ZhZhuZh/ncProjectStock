package com.nc.project.stock.service;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;
import com.nc.project.stock.repository.FavoriteStockRepository;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavoriteStockServiceImpl implements FavoriteStockService {

    private final FavoriteStockRepository repository;

    public FavoriteStockServiceImpl(FavoriteStockRepository repository) {
        this.repository = repository;
    }

    @Override
    public Stock getFavoriteStockById(Integer id) {
        return repository.findFavoriteStockById(id);
    }

    @Override
    public Stock getFavoriteStockByStockName(String stockName) {
        return repository.findFavoriteStockByStockName(stockName);
    }

    @Override
    public List<FavoriteStock> getAllFavoriteStocks() {
        return repository.findAll();
    }
}
