package com.xworkz.project1.enitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "hotel_panjurli_info")
public class HotelPanjurliEntity {

    @Id
    private Integer id;

    private String location;

    @Column(name = "opening_time")
    private LocalTime openingTime;

    @Column(name = "closing_time")
    private LocalTime closingTime;

    @Column(name = "manager_name")
    private String managerName;

    private String city;

    @Column(name = "also_lodge")
    private Boolean isAlsoLodge;

    @Column(name = "avg_income")
    private Integer avgIncome;
}
