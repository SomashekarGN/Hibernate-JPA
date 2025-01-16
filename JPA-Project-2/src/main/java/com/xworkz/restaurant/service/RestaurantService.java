package com.xworkz.restaurant.service;

import com.xworkz.restaurant.entity.RestaurantEntity;

public interface RestaurantService {

    void save(RestaurantEntity entity);

    void getById(Integer id);

    void getByName(String name);

    void updateByName(String name,String location);
}
