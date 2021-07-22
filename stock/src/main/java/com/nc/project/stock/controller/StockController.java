package com.nc.project.stock.controller;

import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.Stock;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import com.nc.project.stock.service.interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    StockService stockService;
    FavoriteStockService favoriteStockService;

    @Autowired(required=true)
    public StockController(StockService stockService) {

        this.stockService = stockService;

    }

    @Autowired
    public StockController(FavoriteStockService favoriteStockService) {

        this.favoriteStockService = favoriteStockService;

    }



    @GetMapping("/AllStocks")
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/AllFavoriteStocks")
    public List<FavoriteStock> getAllFavoriteStocks() {
        //todo добавить зависимость от пользователя
        // @AuthenticationPrincipal User authenticatedUse
        return favoriteStockService.getAllFavoriteStocks();
    }

}
