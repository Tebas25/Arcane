package com.example.arcane.controller;

import com.example.arcane.model.Relacion;
import com.example.arcane.service.RelacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/relaciones")
public class RelacionController {

    @Autowired
    private RelacionService relacionService;

    @GetMapping
    public List<Relacion> getAll() {
        return relacionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Relacion> getById(@PathVariable Long id) {
        return relacionService.getById(id);
    }

    @PostMapping
    public Relacion save(@RequestBody Relacion relacion) {
        return relacionService.save(relacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        relacionService.delete(id);
    }
}
