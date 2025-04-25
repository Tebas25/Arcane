package com.example.arcane.repository;

import com.example.arcane.model.UsoTecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoTecnologiaRepository extends JpaRepository<UsoTecnologia, Long> {
}
