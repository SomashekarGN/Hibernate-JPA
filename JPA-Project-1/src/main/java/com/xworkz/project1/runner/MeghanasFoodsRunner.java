package com.xworkz.project1.runner;

import com.xworkz.project1.enitiy.MeghanasFoodsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalTime;

public class MeghanasFoodsRunner {

    public static void main(String[] args) {

        MeghanasFoodsEntity mfe=new MeghanasFoodsEntity(1,"Rajajinagar",true,"Chandru Naidu", LocalTime.of(10,30), LocalTime.of(12,30),430,150000);
        MeghanasFoodsEntity mfe1 = new MeghanasFoodsEntity(2, "Koramangala", true, "Ananya Rao", LocalTime.of(9, 0), LocalTime.of(11, 0), 420, 135000);
        MeghanasFoodsEntity mfe2 = new MeghanasFoodsEntity(3, "Indiranagar", false, "Ravi Kumar", LocalTime.of(11, 0), LocalTime.of(1, 0), 450, 145000);
        MeghanasFoodsEntity mfe3 = new MeghanasFoodsEntity(4, "Jayanagar", true, "Priya Sharma", LocalTime.of(10, 0), LocalTime.of(12, 30), 430, 155000);
        MeghanasFoodsEntity mfe4 = new MeghanasFoodsEntity(5, "MG Road", true, "Sanjana Mehta", LocalTime.of(8, 30), LocalTime.of(10, 30), 400, 125000);
        MeghanasFoodsEntity mfe5 = new MeghanasFoodsEntity(6, "HSR Layout", false, "Karan Gupta", LocalTime.of(12, 0), LocalTime.of(2, 0), 440, 140000);
        MeghanasFoodsEntity mfe6 = new MeghanasFoodsEntity(7, "Whitefield", true, "Nidhi Patel", LocalTime.of(7, 30), LocalTime.of(9, 30), 410, 130000);
        MeghanasFoodsEntity mfe7 = new MeghanasFoodsEntity(8, "Electronic City", true, "Deepak Verma", LocalTime.of(9, 15), LocalTime.of(11, 15), 420, 138000);
        MeghanasFoodsEntity mfe8 = new MeghanasFoodsEntity(9, "Bellandur", false, "Pooja Singh", LocalTime.of(10, 45), LocalTime.of(12, 45), 430, 145000);
        MeghanasFoodsEntity mfe9 = new MeghanasFoodsEntity(10, "Banashankari", true, "Vikas Nayak", LocalTime.of(8, 0), LocalTime.of(10, 0), 460, 150000);


        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=emf.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            entityManager.persist(mfe);
            entityManager.persist(mfe1);
            entityManager.persist(mfe2);
            entityManager.persist(mfe3);
            entityManager.persist(mfe4);
            entityManager.persist(mfe5);
            entityManager.persist(mfe6);
            entityManager.persist(mfe7);
            entityManager.persist(mfe8);
            entityManager.persist(mfe9);


            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
            emf.close();
        }
    }
}
