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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "meghanasfoods_info")
public class MeghanasFoodsEntity {

    @Id
    @Column(name="id")
    private Integer branchId;

    private String location;

    @Column(name = "cloud_kitchen")
    private Boolean isCloudKitchen;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "opening_time")
    private LocalTime openingTime;

    @Column(name = "closing_time")
    private LocalTime closingTime;

    @Column(name = "avg_orders")
    private Integer avgOrders;

    @Column(name = "avg_income")
    private Integer avgIncome;


}
