package com.example.jee.service;

import com.example.jee.dao.entities.Role;
import com.example.jee.dao.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(()-> new RuntimeException("Role not found"));
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
