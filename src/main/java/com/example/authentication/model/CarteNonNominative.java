package com.example.authentication.model;

public class CarteNonNominative extends Carte{
    public CarteNonNominative(int id) {
        super(id);
    }

    @Override
    public String getType() {
        return "Non Nominative";
    }

    @Override
    public String getInfo() {
        return "Carte Non Nominative";
    }
}
