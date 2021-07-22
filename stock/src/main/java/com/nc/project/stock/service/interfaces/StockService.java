package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.Stock;

import java.util.List;

public interface StockService {



    Stock getStockByStockName(String stockName);

    List<Stock> getAllStocks();

}
