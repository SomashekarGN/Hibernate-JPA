package com.xworkz.restaurant.repository;

import com.xworkz.restaurant.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RestaurantRepoImpl implements RestaurantRepo{

    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
    EntityManager entityManager=emf.createEntityManager();


    @Override
    public Boolean save(RestaurantEntity entity)
    {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
            emf.close();
        }

        entityManager.close();
        return true;
    }

    @Override
    public RestaurantEntity getById(Integer id)
    {
        entityManager.getTransaction().begin();
        RestaurantEntity restaurantEntity=entityManager.find(RestaurantEntity.class,3);
        return restaurantEntity;
    }

    @Override
    public RestaurantEntity getByName(String name) {
        Query query=entityManager.createNamedQuery("getByName");
        query.setParameter("name",name);
        RestaurantEntity entity= (RestaurantEntity) query.getSingleResult();
        return entity;
    }

    @Override
    public RestaurantEntity updateByName(String name, String location) {

        try {
            entityManager.getTransaction().begin();
            Query query=entityManager.createNamedQuery("updateByName");
            query.setParameter("name",name);
            query.setParameter("location",location);
            query.executeUpdate();
            entityManager.getTransaction().commit();

            Query updateQuery=entityManager.createNamedQuery("getByName");
            updateQuery.setParameter("name",name);
            RestaurantEntity updatedentity=(RestaurantEntity) updateQuery.getSingleResult();
            return updatedentity;

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            entityManager.close();
            emf.close();
        }


        return null;
    }
}
