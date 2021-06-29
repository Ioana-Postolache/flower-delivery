package com.ioana.flowerdelivery.data.dao;

import com.ioana.flowerdelivery.data.inventory.CandyData;

import java.util.List;

public interface CandyDAO {
    List<CandyData> list();
    void addToDelivery(Long candyId, Long deliveryId);
    List<CandyData> findByDelivery(Long deliveryId);
}
