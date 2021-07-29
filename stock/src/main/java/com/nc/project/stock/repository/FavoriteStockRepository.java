package com.nc.project.stock.repository;

import com.nc.project.stock.model.CompositeKeyForFavoriteStock;
import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavoriteStockRepository extends MongoRepository<FavoriteStock, Integer> {

    FavoriteStock findFavoriteStockById(CompositeKeyForFavoriteStock id);

    List<FavoriteStock> findFavoriteStocksByUser(User user);

}
