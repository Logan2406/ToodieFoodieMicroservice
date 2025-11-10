package com.toodiefoodie.cart_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class FoodieCart {

    @Id
    private String cartId;

    private LocalDateTime createAt;

    private String userId;

    @OneToMany(mappedBy = "cart")
    private List<FoodieCartItem> foodItems;
}
