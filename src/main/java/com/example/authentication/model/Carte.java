package com.example.authentication.model;



import java.util.ArrayList;
import java.util.List;


abstract class Carte {
    private int id;
        private float solde;
        private List<Operation> operations;

        public Carte(int id) {
            this.id = id;
            this.solde = 0;
            this.operations = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public float getSolde() {
            return solde;
        }

        public List<Operation> getOperations() {
            return operations;
        }

        public void ajouterOperation(Operation operation) {
            operations.add(operation);
        }

        public abstract String getType();

        public abstract String getInfo();
        public List<Operation> getTracabilite() {
            return operations;
         }
}
