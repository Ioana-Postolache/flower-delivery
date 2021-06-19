package com.ioana.flowerdelivery.data.service;

import com.ioana.flowerdelivery.data.inventory.Plant;
import com.ioana.flowerdelivery.data.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantService {
    @Autowired
    PlantRepository plantRepository;

    public Plant getPlantByName(String name) {
        return new Plant();
    }

    //    Save a new Plant and return its Id
    public void save(Plant plant) {
        plantRepository.save(plant);
    }

    //    Check if a plant has been delivered
    public boolean delivered(Long plantId) {
        return plantRepository.existsPlantByIdAndDeliveryCompleted(plantId, true);
    }

    //    Find a list of plants cheaper than a specified amount
    public List<Plant> findPlantsCheaperThanPrice(BigDecimal price) {
        return plantRepository.findByPriceLessThan(price);
    }
}

