package com.toodiefoodie.user_service.requests;

import com.toodiefoodie.user_service.annotations.ValidPinCode;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserAddressDto {
    @NotBlank
    private String addressLineOne;

    private String addressLineTwo;

    @NotBlank
    private String city;

    @NotBlank
    @ValidPinCode
    private String pinCode;

    private String country;

    private String state;

    @NotBlank
    private boolean isDefault;

    @NotBlank
    private double latitude;

    @NotBlank
    private double longitude;
}
