package com.dao;

import com.model.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Create the EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");

        // Create the EntityManager
        EntityManager entityManager = factory.createEntityManager();

        try {
            // Create a transaction object
            Transaction transaction = new Transaction();
            transaction.setMontant(100.0);
            transaction.setCategorie("Food");
            transaction.setDate("2024-05-17");
            transaction.setDescription("Grocery shopping");

            // Start a transaction
            entityManager.getTransaction().begin();

            // Save the transaction object
            entityManager.persist(transaction);

            // Commit transaction
            entityManager.getTransaction().commit();
            System.out.println("Insertion successful");
        } finally {
            entityManager.close();
            factory.close();
        }
    }
}
