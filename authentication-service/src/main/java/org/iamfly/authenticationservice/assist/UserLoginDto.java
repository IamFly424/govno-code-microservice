package org.iamfly.authenticationservice.assist;

import jakarta.validation.constraints.Min;

public class UserLoginDto {

    private final String username;
    @Min(3)
    private final String password;

    public UserLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
