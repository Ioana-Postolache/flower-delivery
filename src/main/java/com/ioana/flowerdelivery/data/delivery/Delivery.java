package com.ioana.flowerdelivery.data.delivery;

import com.ioana.flowerdelivery.data.inventory.Plant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;
    @Column(name = "address_full", length = 500)
    private String address;
    private LocalDateTime deliveryTime; // includes both date and time - simpler than having two separate fields
    @Type(type = "yes_no")
    private Boolean completed;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery")
    private List<Plant> plants;
}
