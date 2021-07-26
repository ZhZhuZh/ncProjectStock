package com.nc.project.stock.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nc.project.stock.model.Stock;
import com.nc.project.stock.repository.StockRepository;
import com.nc.project.stock.service.interfaces.StockService;
import com.nc.project.stock.websocket.WebsocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Queue;

@Component
public class StockServiceImpl implements StockService {

    private final StockRepository repository;

    @Autowired
    public StockServiceImpl(StockRepository repository) {
        this.repository = repository;
    }

    @Override
    public Stock getStockBySymbol(String symbol) {
        return repository.findStockBySymbol(symbol);
    }

    //todo добавить взятие последней по времени акции
    @Override
    public List<Stock> getAllStocks() {
        return repository.findAll();
    }


    /*public List<FavoriteStock> getAllFavoriteStock() {
        return ?;
    }*/

}
