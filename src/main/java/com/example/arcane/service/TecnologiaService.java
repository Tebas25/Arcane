package com.example.arcane.service;

import com.example.arcane.model.Tecnologia;
import com.example.arcane.repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnologiaService {

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    public List<Tecnologia> getAll() {
        return tecnologiaRepository.findAll();
    }

    public Optional<Tecnologia> getById(Long id) {
        return tecnologiaRepository.findById(id);
    }

    public Tecnologia save(Tecnologia tecnologia) {
        return tecnologiaRepository.save(tecnologia);
    }

    public void delete(Long id) {
        tecnologiaRepository.deleteById(id);
    }
}
