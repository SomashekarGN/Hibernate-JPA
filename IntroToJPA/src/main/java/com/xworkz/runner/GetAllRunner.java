package com.xworkz.runner;

import com.xworkz.things.RestaurantEntity;

import javax.persistence.*;
import java.util.List;

public class GetAllRunner {


    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
//        Query getdata=entityManager.createNamedQuery("getAllData");
//        List<RestaurantEntity> resultList=(List<RestaurantEntity>) getdata.getResultList();
//
//        for(RestaurantEntity restaurantEntity :resultList)
//        {
//            System.out.println(restaurantEntity.getRestaurantName());
//        }


        Query query=entityManager.createNamedQuery("getByName");
        query.setParameter("name","KFC");
        try
        {
            RestaurantEntity restaurantEntity=(RestaurantEntity) query.getSingleResult();
            System.out.println(restaurantEntity);
        }
        catch (NoResultException e)
        {
            System.err.println(e.getMessage());
        }


    }
}
