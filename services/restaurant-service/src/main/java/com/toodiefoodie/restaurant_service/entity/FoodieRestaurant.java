package com.toodiefoodie.restaurant_service.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class FoodieRestaurant {
    @Id
    private String restId;

    private String restName;

    private String bannerImageUrl;

    private LocalDateTime createdDate;

    private LocalDateTime closeTime;

    private LocalDateTime openTime;

    private boolean isOpen;

    private String description;

    private boolean isActive;

    private int rating;

    @Embedded
    private FoodieRestAddress address;

    @OneToOne(mappedBy = "restId")
    FoodieItemRestaurant item;
}
