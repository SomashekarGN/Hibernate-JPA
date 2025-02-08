package com.xworkz.runner;

import com.xworkz.things.RestaurantEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RestaurantRunner {

    public static void main(String[] args) {


//        RestaurantEntity restaurantEntity=new RestaurantEntity();
//        restaurantEntity.setId(1);
//        restaurantEntity.setRestaurantName("Nalanda");
//        restaurantEntity.setRestaurantType("Pure Veg");
//        restaurantEntity.setLocation("Rajaji Nagar");
//        restaurantEntity.setRatings(4.5);

       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(restaurantEntity);
//        entityManager.getTransaction().commit();

        //read
//        entityManager.find(RestaurantEntity.class,1);
//        System.out.println(restaurantEntity);



        //update

        EntityTransaction transaction=entityManager.getTransaction();

        try {
            RestaurantEntity restaurantEntity = entityManager.find(RestaurantEntity.class, 1);
            if(restaurantEntity!=null)
            {
                restaurantEntity.setRestaurantName("Empire");
                transaction.begin();
                entityManager.merge(restaurantEntity);
                transaction.commit();
                entityManager.close();
            }


        } catch (Exception e) {
            transaction.rollback();
        }

    }
}
