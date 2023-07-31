package com.login.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.Entities.User;

public interface UserRepository extends JpaRepository<User,String>{
    Optional<User> findByEmail(String email);
}
