package com.example.jee.service;

import com.example.jee.dao.entities.Genre;
import com.example.jee.dao.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElseThrow(()-> new RuntimeException("Genre not found"));
    }
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }
    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
