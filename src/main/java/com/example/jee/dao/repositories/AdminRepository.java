package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
