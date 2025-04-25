package com.example.arcane.model;

import jakarta.persistence.*;

@Entity
public class UsoTecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Personaje personaje;

    @ManyToOne
    private Tecnologia tecnologia;

    private String nivelUso;

    public UsoTecnologia() {}

    public UsoTecnologia(Personaje personaje, Tecnologia tecnologia, String nivelUso) {
        this.personaje = personaje;
        this.tecnologia = tecnologia;
        this.nivelUso = nivelUso;
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

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getNivelUso() {
        return nivelUso;
    }

    public void setNivelUso(String nivelUso) {
        this.nivelUso = nivelUso;
    }
}
