package com.toodiefoodie.restaurant_service.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Embeddable
public class FoodieRestAddress {
    @Id
    private String addressId;

    private String addressLineOne;

    private String addressLineTwo;

    private String city;

    private String country;

    private String state;

    private boolean isDefault;

    private double latitude;

    private double longitude;

}
