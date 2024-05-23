package com.example.jee.service;

import com.example.jee.dao.entities.Post;
import com.example.jee.dao.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long id) {
        return postRepository.findById(id).orElseThrow(()-> new RuntimeException("Post not found"));
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }
    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }
}
