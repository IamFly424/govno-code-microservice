package org.iamfly.authenticationservice.repository;

import org.iamfly.authenticationservice.assist.UserResponseDto;
import org.iamfly.authenticationservice.model.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, Integer> {

    @Query("SELECT * FROM t_user WHERE username = :username")
    User findByUsername(@Param("username") String username);

    @Modifying
    @Query("INSERT INTO t_user(username, email, password, created_at) VALUES (:username, :email, :password, :createdAt)")
    void saveUser(@Param("username") String username, @Param("email") String email,
                  @Param("password") String password, @Param("created_at") LocalDateTime createdAt
    );

    @Query("SELECT username, created_at FROM t_user WHERE username = :username")
    UserResponseDto findDtoByUsername(@Param("username") String username);


}
