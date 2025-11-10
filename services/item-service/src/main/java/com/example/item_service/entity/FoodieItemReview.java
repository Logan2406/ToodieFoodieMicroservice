package com.example.item_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FoodieItemReview {

    @Id
    private String reviewId;

    private String foodItemRestId;

    private int rating;

    @ManyToOne
    FoodieItem item;

}
