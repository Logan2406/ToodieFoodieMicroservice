package com.toodiefoodie.restaurant_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class FoodieItemRestaurant {

    @Id
    private String id;

    private String parentId;

    private String itemName;

    private String description;

    private String foodItemImage;

    private boolean isAvailable;

    private double discountAmount;

    private double price;

    @OneToOne
    private String restId;
}
