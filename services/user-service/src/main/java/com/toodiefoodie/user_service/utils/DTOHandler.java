package com.toodiefoodie.user_service.utils;


import com.toodiefoodie.user_service.dto.UserAddress;
import com.toodiefoodie.user_service.dto.UserDataDto;
import com.toodiefoodie.user_service.entity.FoodieUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DTOHandler {

    public static UserDataDto foodieUserToUserData(FoodieUser user)
    {

        List<UserAddress> addressList= user.getAddresses().stream().map(add -> UserAddress.builder()
                .addressId(add.getAddressId())
                .addressLineOne(add.getAddressLineOne())
                .addressLineTwo(add.getAddressLineTwo())
                .pinCode(add.getPinCode())
                .state(add.getState()).city(add.getCity()).country(add.getCountry()).isDefault(add.isDefault())
                .longitude(add.getLongitude()).latitude(add.getLatitude()).build()).toList();

        return UserDataDto.builder()
                .userId(user.getUserId())
                .userName(user.getName())
                .email(user.getEmail())
                .addresses(addressList)
                .build();

    }
}
