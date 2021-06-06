package com.ioana.flowerdelivery.data.repository;

import com.ioana.flowerdelivery.data.delivery.Delivery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DeliveryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Delivery delivery) {
        entityManager.persist(delivery); //write delivery to the database
    }

    public Delivery find(Long id) {
        return entityManager.find(Delivery.class, id); //retrieve an instance by its key
    }

    public Delivery merge(Delivery delivery) {
        return entityManager.merge(delivery);
    }

    public void delete(Long id) {
        Delivery d = entityManager.find(Delivery.class, id); //retrieve an instance by its key
        entityManager.remove(d);
    }
}
