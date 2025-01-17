package com.xworkz.restaurant.service;

import com.xworkz.restaurant.entity.RestaurantEntity;
import com.xworkz.restaurant.repository.RestaurantRepo;
import com.xworkz.restaurant.repository.RestaurantRepoImpl;

public class RestaurantServiceImpl implements RestaurantService{

    RestaurantRepo restaurantRepo=new RestaurantRepoImpl();
    @Override
    public void save(RestaurantEntity entity)
    {
        Boolean save=restaurantRepo.save(entity);
        if(save)
        {
            System.out.println("Data Saved successfull");
        }
        else
        {
            System.out.println("Data not saved ");
        }
    }

    @Override
    public void getById(Integer id) {
        RestaurantEntity entity=restaurantRepo.getById(id);
        if(entity==null)
        {
            System.out.println("Data Not Found...!");
        }
        else
        {
            System.out.println("Data Found :"+entity);
        }
    }

    @Override
    public void getByName(String name) {
        RestaurantEntity entity=restaurantRepo.getByName(name);

        if(entity!=null)
        {
            System.out.println(" Found data :"+entity);
        }
        else
        {
            System.out.println("Data Not Found...!");
        }

    }

    @Override
    public void updateByName(String name, String location) {
        RestaurantEntity updatedEntity=restaurantRepo.updateByName(name,location);
        if(updatedEntity!= null)
        {
            System.out.println("Updated Entity :"+updatedEntity);
        }
        else
        {
            System.out.println("Name not found please provide a valid name");
        }
    }

    @Override
    public void getLocationById(Integer id) {
        String loc=restaurantRepo.getLocationById(id);
        if(loc!=null)
        {
            System.out.println("Location for the Given id "+id+" is :"+loc);
        }
        else {
            System.out.println("No Location Found For the Provided Id :"+id);
        }
    }

    @Override
    public void getNameAndLocationById(Integer id) {
        RestaurantEntity entity=restaurantRepo.getNameAndLocationById(id);
        String hotelName=entity.getHotelName();
        String location=entity.getLocation();
        if(entity!=null)
        {
            System.out.println("Name and Location For the provided id :"+id+" = "+hotelName+" , "+location);
        }
        else
        {
            System.out.println("No Details Found The Id Provided");
        }
    }
}
