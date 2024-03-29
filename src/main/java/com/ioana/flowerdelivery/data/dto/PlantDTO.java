package com.ioana.flowerdelivery.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PlantDTO {
    private String name;
    private BigDecimal price;
}
