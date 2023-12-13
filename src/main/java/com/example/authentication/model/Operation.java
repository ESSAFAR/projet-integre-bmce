package com.example.authentication.model;

import java.util.Date;

public class Operation {
    private int id;
    private String description;
    private float montant;
    private Date date;

    public Operation(int id, String description, float montant, Date date) {
        this.id = id;
        this.description = description;
        this.montant = montant;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public float getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }
}
