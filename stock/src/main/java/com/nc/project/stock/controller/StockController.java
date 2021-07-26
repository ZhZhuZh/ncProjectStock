package com.nc.project.stock.controller;

import com.nc.project.stock.model.*;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import com.nc.project.stock.service.interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    StockService stockService;
    FavoriteStockService favoriteStockService;

    @Autowired
    public StockController(StockService stockService, FavoriteStockService favoriteStockService) {

        this.stockService = stockService;
        this.favoriteStockService = favoriteStockService;
    }

    @GetMapping("/AllStocks")
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/AllFavoriteStocks")
    public List<FavoriteStock> getAllFavoriteStocks(@AuthenticationPrincipal User user) {
        //todo добавить зависимость от пользователя + getStockByUser
        // @AuthenticationPrincipal User authenticatedUse;
        return favoriteStockService.getStockByUser(user);
    }

}
