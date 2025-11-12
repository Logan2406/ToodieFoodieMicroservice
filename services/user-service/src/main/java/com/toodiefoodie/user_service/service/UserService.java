package com.toodiefoodie.user_service.service;



import com.toodiefoodie.user_service.dto.UserDataDto;
import com.toodiefoodie.user_service.entity.FoodieUser;
import com.toodiefoodie.user_service.exception.UserNotFoundException;
import com.toodiefoodie.user_service.repository.FoodieUserRepository;
import com.toodiefoodie.user_service.utils.DTOHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final FoodieUserRepository foodieUserRepository;

    public UserService(@Autowired FoodieUserRepository foodieUserRepository) {
        this.foodieUserRepository = foodieUserRepository;
    }

    public UserDataDto getUserData(String userId)
    {
        FoodieUser user = foodieUserRepository.findById(userId).orElseThrow(()->new UserNotFoundException("User with the userId could not be Found"));

        return DTOHandler.foodieUserToUserData(user);


    }
}
