package com.xworkz.project1.runner;

import com.xworkz.project1.enitiy.HotelPanjurliEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalTime;

public class HotelPanjurliRunner {

    public static void main(String[] args) {

        HotelPanjurliEntity hotelPanjurli1 = new HotelPanjurliEntity(1,"Gokul Road", LocalTime.of(10,00),LocalTime.of(12,00),"Manjunath Hegede","Hubballi",false,45000);
        HotelPanjurliEntity hotelPanjurli2 = new HotelPanjurliEntity(2, "MG Road", LocalTime.of(9, 30), LocalTime.of(22, 00), "Ravi Kumar", "Bengaluru", true, 52000);
        HotelPanjurliEntity hotelPanjurli3 = new HotelPanjurliEntity(3, "Indiranagar", LocalTime.of(8, 00), LocalTime.of(23, 00), "Ananya Rao", "Mysuru", false, 43000);
        HotelPanjurliEntity hotelPanjurli4 = new HotelPanjurliEntity(4, "Koramangala", LocalTime.of(10, 00), LocalTime.of(21, 00), "Priya Sharma", "Bengaluru", true, 48000);
        HotelPanjurliEntity hotelPanjurli5 = new HotelPanjurliEntity(5, "HSR Layout", LocalTime.of(10, 30), LocalTime.of(22, 30), "Karan Gupta", "Bengaluru", false, 50000);
        HotelPanjurliEntity hotelPanjurli6 = new HotelPanjurliEntity(6, "Whitefield", LocalTime.of(9, 00), LocalTime.of(20, 30), "Sanjana Mehta", "Bengaluru", true, 55000);
        HotelPanjurliEntity hotelPanjurli7 = new HotelPanjurliEntity(7, "Jayanagar", LocalTime.of(11, 00), LocalTime.of(22, 00), "Omkar Desai", "Bengaluru", false, 46000);
        HotelPanjurliEntity hotelPanjurli8 = new HotelPanjurliEntity(8, "Banashankari", LocalTime.of(9, 00), LocalTime.of(23, 30), "Vikas Nayak", "Bengaluru", true, 49000);
        HotelPanjurliEntity hotelPanjurli9 = new HotelPanjurliEntity(9, "Electronic City", LocalTime.of(10, 00), LocalTime.of(20, 00), "Nidhi Patel", "Bengaluru", false, 51000);
        HotelPanjurliEntity hotelPanjurli10 = new HotelPanjurliEntity(10, "Bellandur", LocalTime.of(9, 30), LocalTime.of(21, 30), "Deepak Verma", "Bengaluru", true, 53000);


        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=emf.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(hotelPanjurli1);
            entityManager.persist(hotelPanjurli2);
            entityManager.persist(hotelPanjurli3);
            entityManager.persist(hotelPanjurli4);
            entityManager.persist(hotelPanjurli5);
            entityManager.persist(hotelPanjurli6);
            entityManager.persist(hotelPanjurli7);
            entityManager.persist(hotelPanjurli8);
            entityManager.persist(hotelPanjurli9);
            entityManager.persist(hotelPanjurli10);

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
