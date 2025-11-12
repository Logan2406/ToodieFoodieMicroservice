package com.toodiefoodie.user_service.controller;


import com.toodiefoodie.user_service.dto.UserDataDto;
import com.toodiefoodie.user_service.requests.UserAddressDto;
import com.toodiefoodie.user_service.requests.UserDto;
import com.toodiefoodie.user_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    UserController(@Autowired UserService userService)
    {
        this.userService = userService;

    }


    //fetch current user data
    @GetMapping("/userData/{userId}")
    public ResponseEntity<?> getUserData(@PathVariable("userId") String userId)
    {
        //call the service to fetch the user data
        UserDataDto userDataDto = userService.getUserData(userId);
        return ResponseEntity.status(HttpStatus.FOUND).body(userDataDto);
    }

    @PostMapping("/editUserData/{userId}")
    public ResponseEntity<?> editUserData(@PathVariable("userId") String userId, @RequestBody @Valid UserDto userDto)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body("The User has been edited");
    }

    @PostMapping("/editUserAddress/{userId}/{addId}")
    public ResponseEntity<?> editUserAddressData(@PathVariable("userId") String userId, @PathVariable("addId") String addId, @RequestBody @Valid UserAddressDto userAddressDto)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body("The Address has been edited");
    }

    @PostMapping("/addUserAddress/{userId}")
    public ResponseEntity<?> addUserAddressData(@PathVariable("userId") String userId, @RequestBody @Valid UserAddressDto userAddressDto)
    {

        return ResponseEntity.status(HttpStatus.CREATED).body("The Address has been Added");
    }


}
