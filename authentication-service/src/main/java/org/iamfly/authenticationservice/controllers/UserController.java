package org.iamfly.authenticationservice.controllers;

import org.iamfly.authenticationservice.assist.UserResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public String getUser() {
        return "Hello World!";
    }
}