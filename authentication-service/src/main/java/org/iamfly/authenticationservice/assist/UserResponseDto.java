package org.iamfly.authenticationservice.assist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class UserResponseDto {

    private final String username;
    private final LocalDateTime createdAt;

    @JsonCreator
    public UserResponseDto(@JsonProperty("username") String username,
                           @JsonProperty("created_at") LocalDateTime createdAt) {
        this.username = username;
        this.createdAt = createdAt;
    }


    public String getUsername() {
        return username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
