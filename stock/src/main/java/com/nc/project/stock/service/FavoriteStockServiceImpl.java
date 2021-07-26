package com.nc.project.stock.service;

import com.nc.project.stock.model.CompositeKeyForFavoriteStock;
import com.nc.project.stock.model.FavoriteStock;
import com.nc.project.stock.model.StockHistory;
import com.nc.project.stock.repository.FavoriteStockRepository;
import com.nc.project.stock.service.interfaces.FavoriteStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Component
public class FavoriteStockServiceImpl implements FavoriteStockService {

    private final FavoriteStockRepository repository;

    @Autowired
    public FavoriteStockServiceImpl(FavoriteStockRepository repository) {
        this.repository = repository;
    }

    @Override
    public FavoriteStock getFavoriteStockById(CompositeKeyForFavoriteStock id) {
        return repository.findFavoriteStockById(id);
    }

    /*@Override
    public StockHistory getFavoriteStockBySymbol(String symbol) {
        return repository.findFavoriteStockBySymbol(symbol);
    }*/

    //todo изменить сигнатуру и логику - добавить зависимость от юзера
    @Override
    public List<FavoriteStock> getAllFavoriteStocks(CompositeKeyForFavoriteStock id) {

        List<FavoriteStock> favoriteStocks = new List<FavoriteStock>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<FavoriteStock> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(FavoriteStock favoriteStock) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends FavoriteStock> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends FavoriteStock> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public FavoriteStock get(int index) {
                return null;
            }

            @Override
            public FavoriteStock set(int index, FavoriteStock element) {
                return null;
            }

            @Override
            public void add(int index, FavoriteStock element) {

            }

            @Override
            public FavoriteStock remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<FavoriteStock> listIterator() {
                return null;
            }

            @Override
            public ListIterator<FavoriteStock> listIterator(int index) {
                return null;
            }

            @Override
            public List<FavoriteStock> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        while(!(repository.findFavoriteStockByUserId(id.getUserId())).equals(null)) {

            favoriteStocks.add(repository.findFavoriteStockByUserId(id.getUserId()));

        }

        return favoriteStocks;

    }
}
