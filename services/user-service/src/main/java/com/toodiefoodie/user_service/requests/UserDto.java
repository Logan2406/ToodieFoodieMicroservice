package com.toodiefoodie.user_service.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {
    @NotBlank
    private String name;

    @NotBlank
    private String email;
}
