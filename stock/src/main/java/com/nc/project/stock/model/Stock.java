package com.nc.project.stock.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Setter
@Getter
@NoArgsConstructor
//@Document(collection = "t_stock")
@Table(name = "t_stock")
public class Stock {

    @Id
    private Integer id;

    @Field(value = "Symbol")
    private String symbol;

    @Field(value = "Time")
    private BigInteger timestamp;

    @Field(value = "Current_Price_Day")
    private BigDecimal currentPrice;

    @Field(value = "Currency")
    private String currency;

    @Field(value = "Description")
    private String description;

}
