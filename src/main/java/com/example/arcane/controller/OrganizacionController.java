package com.example.arcane.controller;

import com.example.arcane.model.Organizacion;
import com.example.arcane.service.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/organizaciones")
public class OrganizacionController {

    @Autowired
    private OrganizacionService organizacionService;

    @GetMapping
    public List<Organizacion> getAll() {
        return organizacionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Organizacion> getById(@PathVariable Long id) {
        return organizacionService.getById(id);
    }

    @PostMapping
    public Organizacion save(@RequestBody Organizacion organizacion) {
        return organizacionService.save(organizacion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        organizacionService.delete(id);
    }
}
