package com.nc.project.stock.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "t_favorite_stock")
public class FavoriteStock extends Stock {

    @Id
    private CompositeKey id;

    @Value
    static class CompositeKey implements Serializable {

        private String userId;
        private String symbol;

    }



}
