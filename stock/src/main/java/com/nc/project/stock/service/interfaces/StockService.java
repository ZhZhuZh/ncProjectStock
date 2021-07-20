package com.nc.project.stock.service.interfaces;

import com.nc.project.stock.model.Stock;

import java.util.List;

public interface StockService {

    //Stock getStockById(Integer id);

    Stock getStockByStockName(String stockName);

    List<Stock> getAllStocks();

}
