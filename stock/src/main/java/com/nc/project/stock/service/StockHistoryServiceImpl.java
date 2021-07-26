package com.nc.project.stock.service;

import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.StockHistoryRepository;
import com.nc.project.stock.service.interfaces.StockHistoryService;

public class StockHistoryServiceImpl implements StockHistoryService {

    private final StockHistoryRepository repository;

    public StockHistoryServiceImpl(StockHistoryRepository repository){
        this.repository = repository;
    }

    //todo добавить взятие последней по времени акции
    @Override
    public StockHistory getStockHistoryBySymbol(String symbol) {
        return repository.findStockHistoryBySymbol(symbol);
    }

}
