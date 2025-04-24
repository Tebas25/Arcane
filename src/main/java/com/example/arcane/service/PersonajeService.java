package com.example.arcane.service;

import com.example.arcane.model.Personaje;
import com.example.arcane.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public List<Personaje> getAll() {
        return personajeRepository.findAll();
    }

    public Optional<Personaje> getById(Long id) {
        return personajeRepository.findById(id);
    }

    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public void delete(Long id) {
        personajeRepository.deleteById(id);
    }
}
