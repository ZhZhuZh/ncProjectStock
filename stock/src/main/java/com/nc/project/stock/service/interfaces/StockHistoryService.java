package com.nc.project.stock.service.interfaces;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.nc.project.stock.model.StockHistory;

public interface StockHistoryService {

    StockHistory getStockHistoryBySymbol(String symbol);

    void stockSave() throws JsonProcessingException;

}
