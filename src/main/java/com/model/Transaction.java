package com.model;

import javax.persistence.*;


@Entity
    @Table(name = "transaction")
    public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idTransaction;

        private double montant;

        private String categorie;

        private String dateTransaction;

        private String description;


        @ManyToOne
        @JoinColumn(name = "Iduser")
        private User user;

        @ManyToOne
        @JoinColumn(name = "IdCategorie")
        private Categorie categorieTrans;
        public Transaction(int idTransaction, double montant, java.lang.String categorie, java.lang.String dateTransaction, java.lang.String description) {
            this.idTransaction = idTransaction;
            this.montant = montant;
            this.categorie = categorie;
            this.dateTransaction = dateTransaction;
            this.description = description;
        }



        public Transaction() {

        }


        public int getId() {
            return idTransaction;
        }

        public void setId(int id) {
            this.idTransaction = idTransaction;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double amount) {
            this.montant = montant;
        }

        public java.lang.String getCategorie() {
            return categorie;
        }

        public void setCategory(java.lang.String category) {
            this.categorie = categorie;
        }

        public java.lang.String getDate() {
            return dateTransaction;
        }

        public void setDate(java.lang.String date) {
            this.dateTransaction = dateTransaction;
        }

        public java.lang.String getDescription() {
            return description;
        }

        public void setDescription(java.lang.String description) {
            this.description = description;
        }
    }


