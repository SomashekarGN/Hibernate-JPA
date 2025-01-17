package com.xworkz.restaurant.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@ToString
@Table(name = "resturant_info")
@NamedQuery(name = "getByName", query = "select restaurant from RestaurantEntity restaurant where restaurant.hotelName = :name")
//@NamedQuery(name = "getByName", query = "select r from RestaurantEntity r where r.hotelName = :name")
@NamedQuery(name = "updateByName",query = "update RestaurantEntity restaurant set restaurant.location = :location where restaurant.hotelName = :name")
@NamedQuery(name = "getLocationById",query = "select restaurant.location from RestaurantEntity restaurant where restaurant.id= :id")
@NamedQuery(name = "getNameAndLocationById",query = "select new RestaurantEntity (restaurant.hotelName,restaurant.location) from RestaurantEntity restaurant where restaurant.id= :id")
public class RestaurantEntity {

    @Id
    private Integer id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "is_good")
    private Boolean isGood;

    private Double ratings;

    private String location;

    public RestaurantEntity(String hotelName,String location) {
        this.hotelName = hotelName;
        this.location=location;
    }
}
