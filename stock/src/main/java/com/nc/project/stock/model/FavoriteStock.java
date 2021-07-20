package com.nc.project.stock.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "t_favorite_stock")
public class FavoriteStock extends Stock{


   /*

    @Id (
        userId
        private String stockName
    );

    //private BigDecimal cost;*/

}
