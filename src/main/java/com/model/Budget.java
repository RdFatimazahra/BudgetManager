package com.model;

import javax.persistence.*;


@Entity
    @Table(name = "budget")
    public class Budget {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idBudget;

        private String Categorie;

        private double Limite;

        private double montant;

        @ManyToOne
        @JoinColumn(name = "Iduser")
        private User user;

        @ManyToOne
        @JoinColumn(name = "IdCategorie")
        private Categorie categorie;
        public Budget(int idBudget, java.lang.String categorie, double limite, double montant) {
            this.idBudget = idBudget;
            this.Categorie = categorie;
            this.Limite = limite;
            this.montant = montant;
        }

        public Budget() {

        }

        public int getIdBudget() {
            return idBudget;
        }

        public void setIdBudget(int id) {
            this.idBudget = idBudget;
        }

        public java.lang.String getCategorie() {
            return Categorie;
        }

        public void setCategorie(java.lang.String categorie) {
            this.Categorie = categorie;
        }

        public double getLimite() {
            return Limite;
        }

        public void setLimite(double limite) {
            this.Limite = limite;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double montant) {
            this.montant = montant;
        }


    }

