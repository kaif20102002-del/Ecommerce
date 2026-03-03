package com.example.simpleecommerceapp.repo;

import com.example.simpleecommerceapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Message, Long> {
}
