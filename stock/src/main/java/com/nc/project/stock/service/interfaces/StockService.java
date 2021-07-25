package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.StockHistory;

import java.util.List;

public interface StockService {



    StockHistory getStockByStockName(String stockName);

    List<StockHistory> getAllStocks();

}
