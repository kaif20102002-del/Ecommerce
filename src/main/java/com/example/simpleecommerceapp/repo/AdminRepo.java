package com.example.simpleecommerceapp.repo;

import com.example.simpleecommerceapp.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepo extends JpaRepository<Admin, Long> {
    public Admin findByEmail(String email);
}
