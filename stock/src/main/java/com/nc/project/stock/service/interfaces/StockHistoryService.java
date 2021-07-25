package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.StockHistory;

public interface StockHistoryService {

    StockHistory getStockHistoryBySymbol(String symbol);

}
