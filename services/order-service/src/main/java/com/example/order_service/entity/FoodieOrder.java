package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class FoodieOrder {
    @Id
    private String oderId;

    private LocalDateTime deliveryTime;

    private LocalDateTime orderAt;

    private String paymentId;

    private String paymentMode;

    private String paymentStatus;

    private String status;

    private double totalAmount;

    private FoodieOrderAddress address;

    private String deliveryId;

    private String restaurantId;

    private String userId;

}
