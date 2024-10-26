package org.iamfly.authenticationservice.service;


import org.iamfly.authenticationservice.assist.UserResponseDto;
import org.iamfly.authenticationservice.model.User;
import org.iamfly.authenticationservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserResponseDto findDtoByUsername(String username) {
        return userRepository.findDtoByUsername(username);
    }





}
