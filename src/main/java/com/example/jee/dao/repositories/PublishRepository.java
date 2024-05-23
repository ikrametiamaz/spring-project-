package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Publish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publish, Long> {
}
