package com.ioana.flowerdelivery.data.inventory;

import com.ioana.flowerdelivery.data.delivery.Delivery;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

// Uses InheritanceType.JOINED to store shared fields in 'plant' and unique fields
// in subclass tables
@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized // should use @Nationalized instead of @Type=nstring
    private String name;
    @Column(precision=12, scale=4)
    private BigDecimal price; // BigDecimal is the standard Java class for currency math

    //don't retrieve delivery if we don't need it
    @ManyToOne(fetch = FetchType.LAZY) //many plants can belong to one delivery
    @JoinColumn(name = "delivery_id")  //map the join column in the plant table
    private Delivery delivery;
}
