package com.toodiefoodie.user_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userdemo")
    public String userDemo()
    {
        return "This is just a demo from the user";
    }
}
