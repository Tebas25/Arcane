package com.example.arcane.controller;

import com.example.arcane.model.Afiliacion;
import com.example.arcane.service.AfiliacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/afiliaciones")
public class AfiliacionController {

    @Autowired
    private AfiliacionService afiliacionService;

    @GetMapping
    public List<Afiliacion> getAll() {
        return afiliacionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Afiliacion> getById(@PathVariable Long id) {
        return afiliacionService.getById(id);
    }

    @PostMapping
    public Afiliacion save(@RequestBody Afiliacion afiliacion) {
        return afiliacionService.save(afiliacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        afiliacionService.delete(id);
    }
}
