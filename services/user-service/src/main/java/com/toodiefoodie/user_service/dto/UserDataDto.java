package com.toodiefoodie.user_service.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDataDto {
    private String userId;

    private String userName;

    private String email;

    private List<UserAddress> addresses;
}
