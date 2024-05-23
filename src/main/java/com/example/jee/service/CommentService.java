package com.example.jee.service;

import com.example.jee.dao.entities.Comment;
import com.example.jee.dao.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }
    public Comment findById(Long id) {
        return commentRepository.findById(id).orElseThrow(()-> new RuntimeException("Comment not found"));
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }
}
