package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodieOrderItem {
    @Id
    private String oderItemId;

    private int quantity;

    private String foodItemId;

    private String orderId;
}
