package com.toodiefoodie.user_service.controller;


import com.example.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/userdemo")
    public UserDto userDemo()
    {

        UserDto userDto = new UserDto("ABC","abc@gmail.com");
        return userDto;
    }
}
