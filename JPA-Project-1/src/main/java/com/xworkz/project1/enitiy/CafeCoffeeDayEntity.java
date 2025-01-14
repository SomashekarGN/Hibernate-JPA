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
@Table(name = "ccd_info")
public class CafeCoffeeDayEntity {

    @Id
    @Column(name = "id")
    private Integer branchId;

    private String location;

    @Column(name = "no_of_employees")
    private Integer noOfEmployees;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "seating_capacity")
    private Integer seatingCapacity;

    private String city;
    private String state;
    @Column(name = "active")
    private Boolean isActive;
}
