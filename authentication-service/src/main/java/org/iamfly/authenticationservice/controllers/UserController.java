package org.iamfly.authenticationservice.controllers;

import org.iamfly.authenticationservice.assist.UserRequestDto;
import org.iamfly.authenticationservice.assist.UserResponseDto;
import org.iamfly.authenticationservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRequestDto user) {
        userService.register(user);
        return ResponseEntity.ok().body("Register successfully: " + user.getUsername());
    }

    @GetMapping("/get")
    public ResponseEntity<UserResponseDto> getUser(@RequestParam("username") String username) {
        return ResponseEntity.ok().body(userService.findDtoByUsername(username));
    }

}
