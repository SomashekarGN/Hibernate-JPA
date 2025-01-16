package com.xworkz.restaurant.repository;

import com.xworkz.restaurant.entity.RestaurantEntity;

public interface RestaurantRepo {

    Boolean save(RestaurantEntity entity);

    RestaurantEntity getById(Integer id);

    RestaurantEntity getByName(String name);

    RestaurantEntity updateByName(String name,String location);
}
