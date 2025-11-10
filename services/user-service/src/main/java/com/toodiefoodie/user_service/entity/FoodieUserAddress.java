package com.toodiefoodie.user_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FoodieUserAddress {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    private FoodieUser user;
}
