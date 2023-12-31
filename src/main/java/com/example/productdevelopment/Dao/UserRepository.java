package com.example.productdevelopment.Dao;


import com.example.productdevelopment.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Boolean existsByEmail(String email);
    User findByName(String name);
}
