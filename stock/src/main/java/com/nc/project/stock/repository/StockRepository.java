package com.nc.project.stock.repository;

import com.nc.project.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    Stock findStockById(Integer id);
    Stock findStockByStockName(String stockName);

}
