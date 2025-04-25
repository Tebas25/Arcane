package com.example.arcane.repository;

import com.example.arcane.model.Relacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacionRepository extends JpaRepository<Relacion, Long> {
}
