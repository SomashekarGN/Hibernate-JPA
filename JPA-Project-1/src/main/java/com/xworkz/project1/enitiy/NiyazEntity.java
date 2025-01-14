package com.xworkz.project1.enitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "niyaz_info")
public class NiyazEntity {

    @Id
    private Integer id;

    private String location;

    @Column(name = "no_of_employees")
    private Integer noOfEmployees;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "seating_capacity")
    private  Integer seatingCapacity;

    @Column(name = "avg_income")
    private Double avgIncome;

    @Column(name = "delivery_avaliable")
    private Boolean isDeliveryAvaliable;

    private String city;


}
