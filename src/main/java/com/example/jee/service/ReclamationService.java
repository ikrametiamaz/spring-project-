package com.example.jee.service;

import com.example.jee.dao.entities.Reclamation;
import com.example.jee.dao.repositories.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository;

    public List<Reclamation> getAllReclamation() {
        return reclamationRepository.findAll();
    }

    public Reclamation getReclamationById(Long id) {
        return reclamationRepository.findById(id).orElseThrow(()->new ResourceAccessException("Reclamation not found"));
    }

    public Reclamation save(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }

    public void deleteReclamationById(Long id) {
        reclamationRepository.deleteById(id);
    }
}
