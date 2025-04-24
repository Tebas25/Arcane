package com.example.arcane.controller;

import com.example.arcane.model.Personaje;
import com.example.arcane.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAll() {
        return personajeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> getById(@PathVariable Long id) {
        return personajeService.getById(id);
    }

    @PostMapping
    public Personaje save(@RequestBody Personaje personaje) {
        return personajeService.save(personaje);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        personajeService.delete(id);
    }
}
