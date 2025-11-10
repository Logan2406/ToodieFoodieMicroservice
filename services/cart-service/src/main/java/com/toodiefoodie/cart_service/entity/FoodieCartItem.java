package com.toodiefoodie.cart_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FoodieCartItem {
    @Id
    private String cartItemId;

    private int quantity;

    //restaurantfooditem
    private String foodItemId;

    @ManyToOne
    private FoodieCart cart;
}
