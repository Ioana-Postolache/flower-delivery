package com.ioana.flowerdelivery.data.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class CandyData {
    private Long id;
    private String name;
    private BigDecimal price;
}
