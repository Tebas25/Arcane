package com.example.arcane.model;

import jakarta.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String origen;
    private String rol;
    private String alineacion;

    // Constructor vacío obligatorio
    public Personaje() {}

    // Constructor opcional
    public Personaje(String nombre, String origen, String rol, String alineacion) {
        this.nombre = nombre;
        this.origen = origen;
        this.rol = rol;
        this.alineacion = alineacion;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }
}
