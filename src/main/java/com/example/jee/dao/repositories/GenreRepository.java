package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
