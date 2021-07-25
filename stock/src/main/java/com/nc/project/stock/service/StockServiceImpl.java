package com.nc.project.stock.service;

import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.StockRepository;
import com.nc.project.stock.service.interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//todo separate to StockServiceImpl and StockHistoryServiceImpl
public class StockServiceImpl implements StockService {

    private final StockRepository repository;

    @Autowired
    public StockServiceImpl(StockRepository repository) {
        this.repository = repository;
    }


    //todo добавить взятие последней по времени акции
    @Override
    public StockHistory getStockByStockName(String stockName) {
        return repository.findStockByStockName(stockName);
    }

    //todo добавить взятие последней по времени акции
    @Override
    public List<StockHistory> getAllStocks() {
        return repository.findAll();
    }

    //todo добавить saveStock

    /*public List<FavoriteStock> getAllFavoriteStock() {
        return ?;
    }*/

}
