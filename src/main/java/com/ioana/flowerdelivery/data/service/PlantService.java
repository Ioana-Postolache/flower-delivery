package com.ioana.flowerdelivery.data.service;

import com.ioana.flowerdelivery.data.inventory.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}

