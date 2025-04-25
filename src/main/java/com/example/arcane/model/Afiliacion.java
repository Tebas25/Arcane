package com.example.arcane.model;

import jakarta.persistence.*;

@Entity
public class Afiliacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Personaje personaje;

    @ManyToOne
    private Organizacion organizacion;

    private String cargo;

    public Afiliacion() {}

    public Afiliacion(Personaje personaje, Organizacion organizacion, String cargo) {
        this.personaje = personaje;
        this.organizacion = organizacion;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
