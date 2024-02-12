package com.example.authentication.api;

import com.example.authentication.model.Carte;
import com.example.authentication.service.CarteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartes")
@AllArgsConstructor
public class CartesController {

    private final CarteService carteService;

    @GetMapping("/all")
    public List<Carte> getAll(){
        return carteService.getAllCartes();
    }
}
