package com.ioana.flowerdelivery.data.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.ioana.flowerdelivery.data.Views;
import com.ioana.flowerdelivery.data.dto.PlantDTO;
import com.ioana.flowerdelivery.data.inventory.Plant;
import com.ioana.flowerdelivery.data.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantService plantService;

    public PlantDTO getPlantDTO(String name){
        Plant plant = plantService.getPlantByName(name);
        return null;
    }

    @JsonView(Views.Public.class)
    public Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }

    private PlantDTO convertPlantToPlantDTO(Plant plant){
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plant, plantDTO);
        return plantDTO;
    }
}
