package com.nc.project.stock.repository;

import com.nc.project.stock.model.CompositeKeyForFavoriteStock;
import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavoriteStockRepository extends MongoRepository<FavoriteStock, Integer> {

    FavoriteStock findFavoriteStockById(CompositeKeyForFavoriteStock id);

    // не имеет смысла потому что АйДи в данном классе составное из айДи пользователя и символа
    // StockHistory findFavoriteStockBySymbol(String symbol);

    List<FavoriteStock> findFavoriteStockByUserId(Integer id);

}
