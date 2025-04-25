package com.example.arcane.controller;

import com.example.arcane.model.UsoTecnologia;
import com.example.arcane.service.UsoTecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/uso-tecnologias")
public class UsoTecnologiaController {

    @Autowired
    private UsoTecnologiaService usoTecnologiaService;

    @GetMapping
    public List<UsoTecnologia> getAll() {
        return usoTecnologiaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<UsoTecnologia> getById(@PathVariable Long id) {
        return usoTecnologiaService.getById(id);
    }

    @PostMapping
    public UsoTecnologia save(@RequestBody UsoTecnologia usoTecnologia) {
        return usoTecnologiaService.save(usoTecnologia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        usoTecnologiaService.delete(id);
    }
}
