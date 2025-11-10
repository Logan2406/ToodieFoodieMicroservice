package com.toodiefoodie.delivery_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodieDeliveryUser {

    @Id
    private String delId;

    private String name;

    @Embedded
    private FoodieDeliveryAddress delAddress;

    private double totalEarning;

}
