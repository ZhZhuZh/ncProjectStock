package com.nc.project.stock.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "t_favorite_stock")
public class FavoriteStock extends Stock{


   /*

    @Id (
        userId
        private String simbol;
    );

    //private BigDecimal cost;*/

}
