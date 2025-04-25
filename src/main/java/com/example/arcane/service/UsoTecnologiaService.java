package com.example.arcane.service;

import com.example.arcane.model.UsoTecnologia;
import com.example.arcane.repository.UsoTecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsoTecnologiaService {

    @Autowired
    private UsoTecnologiaRepository usoTecnologiaRepository;

    public List<UsoTecnologia> getAll() {
        return usoTecnologiaRepository.findAll();
    }

    public Optional<UsoTecnologia> getById(Long id) {
        return usoTecnologiaRepository.findById(id);
    }

    public UsoTecnologia save(UsoTecnologia usoTecnologia) {
        return usoTecnologiaRepository.save(usoTecnologia);
    }

    public void delete(Long id) {
        usoTecnologiaRepository.deleteById(id);
    }
}
