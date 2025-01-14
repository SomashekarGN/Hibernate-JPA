package com.xworkz.project1.enitiy;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Data
@Getter
@Setter
@Table(name="dominos_info")
public class DominosEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "location")
    private String location;

    @Column(name = "no_of_employees")
    private Integer noOfEmployees;

    @Column(name = "delivery_available")
    private Boolean isDeliveryAvailable;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "ratings")
    private Double ratings;

    @Column(name = "ph_number")
    private Long phNumber;

    @Column(name = "active")
    private Boolean isActive;
}
