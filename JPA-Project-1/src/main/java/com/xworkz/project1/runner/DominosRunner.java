package com.xworkz.project1.runner;

import com.xworkz.project1.enitiy.DominosEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DominosRunner {

    public static void main(String[] args) {

        DominosEntity entity1 = new DominosEntity(1, "Rajajinagar", 12, true, "Omkar Desai", 4.5, 9880776405L, true);
        DominosEntity entity2 = new DominosEntity(2, "Jayanagar", 15, false, "Priya Sharma", 4.2, 9845098765L, true);
        DominosEntity entity3 = new DominosEntity(3, "MG Road", 20, true, "Karan Gupta", 4.8, 9812345678L, true);
        DominosEntity entity4 = new DominosEntity(4, "Koramangala", 10, false, "Ananya Rao", 4.3, 9876543210L, true);
        DominosEntity entity5 = new DominosEntity(5, "Indiranagar", 18, true, "Ravi Kumar", 4.6, 9823456789L, false);
        DominosEntity entity6 = new DominosEntity(6, "Whitefield", 22, true, "Sanjana Mehta", 4.7, 9811122233L, true);
        DominosEntity entity7 = new DominosEntity(7, "Banashankari", 8, false, "Deepak Verma", 4.1, 9845671234L, true);
        DominosEntity entity8 = new DominosEntity(8, "HSR Layout", 14, true, "Pooja Singh", 4.4, 9876123456L, true);
        DominosEntity entity9 = new DominosEntity(9, "Electronic City", 19, true, "Vikas Nayak", 4.9, 9867543210L, false);
        DominosEntity entity10 = new DominosEntity(10, "Bellandur", 13, false, "Nidhi Patel", 4.2, 9834567890L, true);


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            entityManager.persist(entity1);
            entityManager.persist(entity2);
            entityManager.persist(entity3);
            entityManager.persist(entity4);
            entityManager.persist(entity5);
            entityManager.persist(entity6);
            entityManager.persist(entity7);
            entityManager.persist(entity8);
            entityManager.persist(entity9);
            entityManager.persist(entity10);

            entityManager.getTransaction().commit();
            System.out.println("All entities persisted successfully!");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
