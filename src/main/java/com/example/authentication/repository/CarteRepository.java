package com.example.authentication.repository;

import com.example.authentication.model.Carte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteRepository extends JpaRepository<Carte, Long> {
}
