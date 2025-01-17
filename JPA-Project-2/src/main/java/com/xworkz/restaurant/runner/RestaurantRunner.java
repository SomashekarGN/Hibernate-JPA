package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestaurantEntity;
import com.xworkz.restaurant.service.RestaurantService;
import com.xworkz.restaurant.service.RestaurantServiceImpl;

public class RestaurantRunner {

    public static void main(String[] args) {

        RestaurantEntity restaurantEntity1 = new RestaurantEntity(1,"New Udupi Uphar",true,4.5,"Malleshwram");
        RestaurantEntity restaurantEntity2 = new RestaurantEntity(2, "Empire Restaurant", true, 4.2, "Koramangala");
        RestaurantEntity restaurantEntity3 = new RestaurantEntity(3, "Meghana Foods", true, 4.7, "Indiranagar");
        RestaurantEntity restaurantEntity4 = new RestaurantEntity(4, "Shiv Sagar", false, 3.8, "Jayanagar");
        RestaurantEntity restaurantEntity5 = new RestaurantEntity(5, "Brahmin's Coffee Bar", true, 4.9, "Basavanagudi");


        RestaurantService restaurantService=new RestaurantServiceImpl();
//        restaurantService.save(restaurantEntity1);
//        restaurantService.save(restaurantEntity2);
//        restaurantService.save(restaurantEntity3);
//        restaurantService.save(restaurantEntity4);
//        restaurantService.save(restaurantEntity5);

//Get BY ID
       //restaurantService.getById(2);
        //System.out.println(entity);

//Get BY Name
        //restaurantService.getByName("Empire Restaurant");

//Update By Name
        //restaurantService.updateByName("Empire Restaurant","Rajajinagar");

//Get Location By id
        //restaurantService.getLocationById(1);

//Get Name And Location By Id
    restaurantService.getNameAndLocationById(1);

    }
}
