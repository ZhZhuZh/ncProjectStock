package com.nc.project.stock.service.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nc.project.stock.model.Stock;

import java.util.List;

public interface StockService {

    Stock getStockBySymbol(String symbol);

    List<Stock> getAllStocks();

    void stockSave() throws JsonProcessingException;

}
