package com.example.item_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class FoodieItem {

    @Id
    private String itemId;

    private String itemName;

    private String description;

    private String foodType;

    private String imageUrl;

    @OneToMany
    private List<FoodieItemReview> reviews;

}
