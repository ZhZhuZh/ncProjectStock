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

import java.util.List;
import java.util.Queue;

@Component
public class StockServiceImpl implements StockService {

    private final StockRepository repository;

    private WebsocketClient client;

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



    @Scheduled(fixedRate = 3000)
    public void stockSave() throws JsonProcessingException {

        Queue<String> newQueue = client.getQueue();
        ObjectMapper stockMapper = new ObjectMapper();
        Stock stock;

        client.clearQueue();

        for (String jsonStr : newQueue) {
            stock = stockMapper.readValue(jsonStr, Stock.class);
            repository.save(stock);
        }
    }


    /*public List<FavoriteStock> getAllFavoriteStock() {
        return ?;
    }*/

}
