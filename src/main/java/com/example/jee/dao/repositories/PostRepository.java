package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
