package com.nc.project.stock.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.StockHistoryRepository;
import com.nc.project.stock.service.interfaces.StockHistoryService;
import com.nc.project.stock.websocket.WebsocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Queue;

@Component
public class StockHistoryServiceImpl implements StockHistoryService {

    private final StockHistoryRepository repository;

    private final WebsocketClient client;

    @Autowired
    private ObjectMapper stockMapper;

    public StockHistoryServiceImpl(StockHistoryRepository repository, WebsocketClient client){
        this.repository = repository;
        this.client = client;
    }

    //todo добавить взятие последней по времени акции
    @Override
    public StockHistory getStockHistoryBySymbol(String symbol) {
        return repository.findStockHistoryBySymbol(symbol);
    }

    @Scheduled(fixedRate = 3000)
    public void stockSave() throws JsonProcessingException {

        StockHistory stockHistory;
        String jsonStr;
        int size = client.getQueue().size();

//        for (String jsonStr : newQueue) {
        for(int i = 0; i < size; i++){
            jsonStr = client.getQueue().poll();
            stockHistory = this.stockMapper.readValue(jsonStr, StockHistory.class);
            repository.save(stockHistory);
        }
    }

}
