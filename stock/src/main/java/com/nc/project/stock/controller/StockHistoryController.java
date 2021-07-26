package com.nc.project.stock.controller;

import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.service.interfaces.StockHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockHistoryController {

    StockHistoryService stockHistoryService;

    @Autowired
    public StockHistoryController(StockHistoryService stockHistoryService) {

        this.stockHistoryService = stockHistoryService;
    }

}
