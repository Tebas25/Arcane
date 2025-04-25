package com.example.arcane.service;

import com.example.arcane.model.Organizacion;
import com.example.arcane.repository.OrganizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizacionService {

    @Autowired
    private OrganizacionRepository organizacionRepository;

    public List<Organizacion> getAll() {
        return organizacionRepository.findAll();
    }

    public Optional<Organizacion> getById(Long id) {
        return organizacionRepository.findById(id);
    }

    public Organizacion save(Organizacion organizacion) {
        return organizacionRepository.save(organizacion);
    }

    public void delete(Long id) {
        organizacionRepository.deleteById(id);
    }
}
