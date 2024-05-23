package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
