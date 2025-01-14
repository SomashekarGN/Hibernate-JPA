package com.xworkz.project1.runner;

import com.xworkz.project1.enitiy.NiyazEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NiyazRunner {

    public static void main(String[] args) {

        NiyazEntity niyazEntity1 = new NiyazEntity(14,"Vidya Nagar",15,"Abudulla khan",45,50500.00,true,"Hubballi");
        NiyazEntity niyazEntity2 = new NiyazEntity(15, "Keshwapur", 20, "Irfan Pathan", 50, 60500.00, true, "Hubballi");
        NiyazEntity niyazEntity3 = new NiyazEntity(16, "Navanagar", 12, "Mohammed Ali", 40, 45500.00, false, "Dharwad");
        NiyazEntity niyazEntity4 = new NiyazEntity(17, "Gokul Road", 25, "Faisal Ahmed", 60, 75500.00, true, "Hubballi");
        NiyazEntity niyazEntity5 = new NiyazEntity(18, "Old Hubli", 18, "Riyaz Khan", 48, 50500.00, true, "Hubballi");
        NiyazEntity niyazEntity6 = new NiyazEntity(19, "Shivaji Nagar", 22, "Arshad Sharif", 55, 67500.00, false, "Bengaluru");
        NiyazEntity niyazEntity7 = new NiyazEntity(20, "Saraswatpur", 17, "Zahid Sheikh", 35, 42500.00, true, "Dharwad");
        NiyazEntity niyazEntity8 = new NiyazEntity(21, "Kusugal Road", 19, "Imran Qureshi", 45, 52000.00, true, "Hubballi");
        NiyazEntity niyazEntity9 = new NiyazEntity(22, "Unkal", 21, "Azhar Siddiqui", 50, 61000.00, true, "Hubballi");
        NiyazEntity niyazEntity10 = new NiyazEntity(23, "Kelgeri", 16, "Wasim Akram", 42, 49500.00, false, "Dharwad");



        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=emf.createEntityManager();


        try {
            entityManager.getTransaction().begin();
            entityManager.persist(niyazEntity1);
            entityManager.persist(niyazEntity2);
            entityManager.persist(niyazEntity3);
            entityManager.persist(niyazEntity4);
            entityManager.persist(niyazEntity5);
            entityManager.persist(niyazEntity6);
            entityManager.persist(niyazEntity7);
            entityManager.persist(niyazEntity8);
            entityManager.persist(niyazEntity9);
            entityManager.persist(niyazEntity10);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            emf.close();
            entityManager.close();
        }


    }
}
