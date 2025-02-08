package com.xworkz.things;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "restaurant")
@NamedQuery(name="getAllData",query="Select hotel from RestaurantEntity restaurant")
@NamedQuery(name="getByName",query = "select hotel from RestaurantEntity restaurant where restaurant.restaurantName = :name")
public class RestaurantEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Column(name = "location")
    private String location;

    @Column(name = "ratings")
    private Double ratings;

    @Column(name = "restaurant_Type")
    private String restaurantType;
}
