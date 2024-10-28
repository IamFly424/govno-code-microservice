package org.iamfly.authenticationservice.assist;

import org.iamfly.authenticationservice.model.Role;

public class CustomUserDetailsDto {

    private final String username;
    private final String password;
    private final Role role;

    public CustomUserDetailsDto(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
