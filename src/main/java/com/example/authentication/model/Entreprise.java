package com.example.authentication.model;

import java.util.*;

public class Entreprise {
    private int id;
    private String nom;
    private List<Carte> cartes;

    public Entreprise(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.cartes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public void ajouterCarte(Carte carte) {
        this.cartes.add(carte);
    }
}
