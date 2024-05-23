package com.example.jee.dao.repositories;

import com.example.jee.dao.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
