package com.example.authentication.model;




public class CarteNominative extends Carte{
    private Employe employe;

    public CarteNominative(int id, Employe employe) {
        super(id);
        this.employe = employe;
    }

    public Employe getEmploye() {
        return employe;
    }

    @Override
    public String getType() {
        return "Nominative";
    }

    @Override
    public String getInfo() {
        return "Carte Nominative - Employé : " + employe.getNomComplet();
    }

}
