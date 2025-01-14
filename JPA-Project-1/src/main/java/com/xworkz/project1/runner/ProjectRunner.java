package com.xworkz.project1.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProjectRunner {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
    }
}
