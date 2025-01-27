package com.xworkz.project3.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supermarket_info")
public class SuperMarketEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "location")
        private String location;

        @Column(name = "opening_time")
        private LocalTime openingTime;

        @Column(name = "closing_time")
        private LocalTime closingTime;

        @Column(name = "number_of_employees")
        private Integer numberOfEmployees;

        @Column(name = "is_open")
        private Boolean isOpen;

        @Column(name = "monthly_revenue")
        private Double monthlyRevenue;
}
