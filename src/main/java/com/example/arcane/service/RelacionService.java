package com.example.arcane.service;

import com.example.arcane.model.Relacion;
import com.example.arcane.repository.RelacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelacionService {

    @Autowired
    private RelacionRepository relacionRepository;

    public List<Relacion> getAll() {
        return relacionRepository.findAll();
    }

    public Optional<Relacion> getById(Long id) {
        return relacionRepository.findById(id);
    }

    public Relacion save(Relacion relacion) {
        return relacionRepository.save(relacion);
    }

    public void delete(Long id) {
        relacionRepository.deleteById(id);
    }
}
