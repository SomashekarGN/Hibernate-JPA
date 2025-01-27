package com.xworkz.project3.runner;

import com.xworkz.project3.dto.RestaurantDTO;
import com.xworkz.project3.repository.RestaurantRepo;
import com.xworkz.project3.repository.RestaurantRepoImpl;

public class RestaurantRunner {

    public static void main(String[] args) {

        RestaurantDTO restaurantDTO=new RestaurantDTO();
        restaurantDTO.setName("somashekar");
        restaurantDTO.setId(10);
        restaurantDTO.setRatings(4.0);
        restaurantDTO.setPincode(43533L);
        restaurantDTO.setContactNum(97430659L);

        RestaurantRepo restaurantRepo=new RestaurantRepoImpl();

        restaurantRepo.validateAndSave(restaurantDTO);
    }
}
