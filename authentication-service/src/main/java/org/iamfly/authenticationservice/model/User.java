package org.iamfly.authenticationservice.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Table("t_user")
public class User implements UserDetails {

    private final String username;
    private final String email;
    private final String password;
    @Column("created_at")
    private LocalDateTime createdAt;
    @Column("posts_id")
    private List<Integer> postsId;

    public User(String username, String email, String password, LocalDateTime createdAt, List<Integer> postsId) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.postsId = postsId;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Integer> getPostsId() {
        return postsId;
    }

    public String getEmail() {
        return email;
    }
}
