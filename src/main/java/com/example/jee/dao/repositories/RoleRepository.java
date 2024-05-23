package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
