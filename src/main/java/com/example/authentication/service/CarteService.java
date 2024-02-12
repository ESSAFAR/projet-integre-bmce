package com.example.authentication.service;

import com.example.authentication.repository.CarteRepository;
import com.example.authentication.model.Carte;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarteService {
    private final CarteRepository carteRepository;

    public List<Carte> getAllCartes(){
        return carteRepository.findAll();
    }
}
