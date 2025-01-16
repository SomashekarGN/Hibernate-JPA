package com.xworkz.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "resturant_info")
@NamedQuery(name = "getByName", query = "select restaurant from RestaurantEntity restaurant where restaurant.hotelName = :name")
//@NamedQuery(name = "getByName", query = "select r from RestaurantEntity r where r.hotelName = :name")
@NamedQuery(name = "updateByName",query = "update RestaurantEntity restaurant set restaurant.location = :location where restaurant.hotelName = :name")
public class RestaurantEntity {

    @Id
    private Integer id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "is_good")
    private Boolean isGood;

    private Double ratings;

    private String location;
}
