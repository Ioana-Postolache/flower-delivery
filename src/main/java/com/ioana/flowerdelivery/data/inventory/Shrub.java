package com.ioana.flowerdelivery.data.inventory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Shrub extends Plant{
    private int heightCm;
    private int widthCm;
}
