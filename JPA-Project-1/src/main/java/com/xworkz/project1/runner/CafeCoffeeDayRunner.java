package com.xworkz.project1.runner;

import com.xworkz.project1.enitiy.CafeCoffeeDayEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CafeCoffeeDayRunner {

    public static void main(String[] args) {

        CafeCoffeeDayEntity ccd=new CafeCoffeeDayEntity(1,"Rajajinagar",07,"Sherkawat Singh",45,"Bengaluru","Karnataka",true);
        CafeCoffeeDayEntity ccd1 = new CafeCoffeeDayEntity(2, "Jayanagar", 9, "Priya Sharma", 30, "Bengaluru", "Karnataka", true);
        CafeCoffeeDayEntity ccd2 = new CafeCoffeeDayEntity(3, "MG Road", 8, "Karan Gupta", 50, "Bengaluru", "Karnataka", false);
        CafeCoffeeDayEntity ccd3 = new CafeCoffeeDayEntity(4, "Koramangala", 10, "Ananya Rao", 35, "Bengaluru", "Karnataka", true);
        CafeCoffeeDayEntity ccd4 = new CafeCoffeeDayEntity(5, "Whitefield", 6, "Sanjana Mehta", 40, "Bengaluru", "Karnataka", false);
        CafeCoffeeDayEntity ccd5 = new CafeCoffeeDayEntity(6, "Indiranagar", 12, "Ravi Kumar", 60, "Bengaluru", "Karnataka", true);
        CafeCoffeeDayEntity ccd6 = new CafeCoffeeDayEntity(7, "HSR Layout", 7, "Pooja Singh", 25, "Bengaluru", "Karnataka", true);
        CafeCoffeeDayEntity ccd7 = new CafeCoffeeDayEntity(8, "Banashankari", 9, "Deepak Verma", 50, "Bengaluru", "Karnataka", false);
        CafeCoffeeDayEntity ccd8 = new CafeCoffeeDayEntity(9, "Electronic City", 11, "Vikas Nayak", 55, "Bengaluru", "Karnataka", true);
        CafeCoffeeDayEntity ccd9 = new CafeCoffeeDayEntity(10, "Bellandur", 8, "Nidhi Patel", 35, "Bengaluru", "Karnataka", true);


        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(ccd);
            entityManager.persist(ccd1);
            entityManager.persist(ccd2);
            entityManager.persist(ccd3);
            entityManager.persist(ccd4);
            entityManager.persist(ccd5);
            entityManager.persist(ccd6);
            entityManager.persist(ccd7);
            entityManager.persist(ccd8);
            entityManager.persist(ccd9);


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
