package com.example.arcane.model;

import jakarta.persistence.*;

@Entity
public class Relacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Personaje personaje1;

    @ManyToOne
    private Personaje personaje2;

    private String tipo;

    public Relacion() {}

    public Relacion(Personaje personaje1, Personaje personaje2, String tipo) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
