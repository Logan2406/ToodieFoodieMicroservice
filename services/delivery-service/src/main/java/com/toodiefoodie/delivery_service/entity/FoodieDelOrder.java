package com.toodiefoodie.delivery_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodieDelOrder {
    @Id
    private String delOrderId;

    private String orderId;

    private String deliveryId;

    private double amountEarned;
}
