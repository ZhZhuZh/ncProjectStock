package com.nc.project.stock.controller;

import com.nc.project.stock.model.Stock;
import com.nc.project.stock.service.interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping("/AllStocks")
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

}
