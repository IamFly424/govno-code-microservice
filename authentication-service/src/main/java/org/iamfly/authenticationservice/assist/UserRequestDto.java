package org.iamfly.authenticationservice.assist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

public class UserRequestDto {

    @Min(3)
    private final String username;
    @Email
    private final String email;
    @Min(3)
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
