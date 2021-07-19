package com.nc.project.stock.service;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;
import com.nc.project.stock.repository.StockRepository;
import com.nc.project.stock.service.interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockServiceImpl implements StockService {

    private final StockRepository repository;

    @Autowired
    public StockServiceImpl(StockRepository repository) {
        this.repository = repository;
    }

    @Override
    public Stock getStockById(Integer id) {
        return repository.findStockById(id);
    }

    @Override
    public Stock getStockByStockName(String stockName) {
        return repository.findStockByStockName(stockName);
    }

    @Override
    public List<Stock> getAllStocks() {
        return repository.findAll();
    }

    /*public List<FavoriteStock> getAllFavoriteStock() {
        return ?;
    }*/

}
