package com.example.authentication.model;

public class Employe {
    private int id;
    private String nom;
    private String prenom;

    public Employe(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }
}
