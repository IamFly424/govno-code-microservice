package org.iamfly.authenticationservice.assist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequestDto {

    private final String username;
    private final String email;
    private final String password;

    @JsonCreator
    public UserRequestDto
            (@JsonProperty String username,
             @JsonProperty String email,
             @JsonProperty String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
