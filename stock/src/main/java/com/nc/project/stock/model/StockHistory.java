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
@Document(collection = "t_stock_history")
//todo copy fields to Stock
public class StockHistory {

    @Id
    private Integer id;

    @Field(value = "Symbol")
    private String symbol;

    @Field(value = "Time")
    private BigInteger timestamp;

    // point Quote
    @Field(value = "High_Price_Day")
    private BigDecimal highPriceOfTheDay;

    @Field(value = "Low_Price_Day")
    private BigDecimal lowPriceOfTheDay;

    @Field(value = "Current_Price_Day")
    private BigDecimal currentPriceOfTheDay;

    @Field(value = "Currency")
    private String currency;

    @Field(value = "Description")
    private String description;

}
