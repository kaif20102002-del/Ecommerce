package com.example.simpleecommerceapp.repo;

import com.example.simpleecommerceapp.entity.Admin;
import com.example.simpleecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
