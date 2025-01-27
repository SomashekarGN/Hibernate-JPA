package com.xworkz.project3.repository;

import com.xworkz.project3.dto.RestaurantDTO;
import com.xworkz.project3.entitiy.RestaurantEntity;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class RestaurantRepoImpl implements RestaurantRepo{
    @Override
    public void validateAndSave(RestaurantDTO restaurantDTO) {
       ValidatorFactory validatorFactory= Validation.buildDefaultValidatorFactory();
       Validator validator=validatorFactory.getValidator();
       Set<ConstraintViolation<RestaurantDTO>> val=validator.validate(restaurantDTO);

       if(!val.isEmpty()) {
           val.stream().forEach(err -> System.out.println(err.getMessage()));
       }
       else {
           System.out.println("All Fields Validated...! and Data saved successfully...");

           RestaurantEntity restaurantEntity=new RestaurantEntity();
           restaurantEntity.setId(restaurantDTO.getId());
           restaurantEntity.setName(restaurantDTO.getName());
           restaurantEntity.setRatings(restaurantDTO.getRatings());
           restaurantEntity.setLocation(restaurantDTO.getLocation());
           restaurantEntity.setPincode(restaurantDTO.getPincode());
           restaurantEntity.setContactNum(restaurantDTO.getContactNum());
           restaurantEntity.setRType(restaurantDTO.getRType());
       }
    }
}
