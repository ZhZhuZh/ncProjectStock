package com.nc.project.stock.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Setter
@Getter
@Value
public class CompositeKeyForFavoriteStock implements Serializable {

    private Integer userId;
    private String symbol;

}
