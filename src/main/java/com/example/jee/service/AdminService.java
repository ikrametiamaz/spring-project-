package com.example.jee.service;

import com.example.jee.dao.entities.Admin;
import com.example.jee.dao.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
@Service
public class AdminService {
   @Autowired
    private AdminRepository adminRepository;

   public List<Admin> findAll() {
       return adminRepository.findAll();
   }

   public Admin findById(Long id) {
       return adminRepository.findById(id).orElseThrow(()-> new ResourceAccessException("Admin not found"));
   }

   public Admin save(Admin admin) {
       return adminRepository.save(admin);
   }

   public void deleteById(Long id) {
       adminRepository.deleteById(id);
   }
}
