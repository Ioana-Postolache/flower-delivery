package com.ioana.flowerdelivery.data.projection;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecipientAndPrice {
    private String name;
    private BigDecimal price;

    public RecipientAndPrice(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }
}
