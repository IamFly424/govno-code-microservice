package org.iamfly.authenticationservice.service;


import org.iamfly.authenticationservice.assist.UserLoginDto;
import org.iamfly.authenticationservice.assist.UserRequestDto;
import org.iamfly.authenticationservice.assist.UserResponseDto;
import org.iamfly.authenticationservice.model.User;
import org.iamfly.authenticationservice.repository.UserRepository;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void register(UserRequestDto user) {
        userRepository.saveUser(user.getUsername(),
                user.getEmail(),
                passwordEncoder.encode(user.getPassword()),
                LocalDateTime.now()
                );
    }

    public String login(UserLoginDto user) {
        String databasePassword = userRepository.findPassword(user.getUsername());
        if (databasePassword == null || !passwordEncoder.matches(user.getPassword(), databasePassword)) {
            throw new BadCredentialsException("incorrect login or password");
        }
        return "Login successful";
    }

    public UserResponseDto findDtoByUsername(String username) {
        return userRepository.findDtoByUsername(username);
    }





}
