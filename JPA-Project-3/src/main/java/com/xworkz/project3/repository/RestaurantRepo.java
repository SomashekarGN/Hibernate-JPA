package com.xworkz.project3.repository;

import com.xworkz.project3.dto.RestaurantDTO;

public interface RestaurantRepo {

    void validateAndSave(RestaurantDTO restaurantDTO);
}
