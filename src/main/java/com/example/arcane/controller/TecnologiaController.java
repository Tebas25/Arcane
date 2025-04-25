package com.example.arcane.controller;

import com.example.arcane.model.Tecnologia;
import com.example.arcane.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tecnologias")
public class TecnologiaController {

    @Autowired
    private TecnologiaService tecnologiaService;

    @GetMapping
    public List<Tecnologia> getAll() {
        return tecnologiaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Tecnologia> getById(@PathVariable Long id) {
        return tecnologiaService.getById(id);
    }

    @PostMapping
    public Tecnologia save(@RequestBody Tecnologia tecnologia) {
        return tecnologiaService.save(tecnologia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tecnologiaService.delete(id);
    }
}
