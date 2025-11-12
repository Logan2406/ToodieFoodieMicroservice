package com.toodiefoodie.user_service.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserAddress {
    private String addressId;

    private String addressLineOne;

    private String addressLineTwo;

    private String city;

    private String pinCode;

    private String country;

    private String state;

    private boolean isDefault;

    private double latitude;

    private double longitude;
}
