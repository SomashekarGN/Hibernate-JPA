package com.xworkz.project3.dto;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class RestaurantDTO {



    private Integer id;
    @NotNull(message = "RestaurantDTO Name should not be Null")
    @Size(min=3,max = 20,message = "Name should be minimum-3 maximum-20")
    private String name;
    @Min(value = 1,message = "Rating should at least be 1")
    @Max(value = 5,message = "Ratings should not be more than 5")
    private Double ratings;
    private String location;
    @Min(value = 4,message = "Enter a valid pincode")
    @Max(value = 6,message = "Enter a valid pincode")
    private Long pincode;
    @Min(value = 10,message = "Enter a valid phone num")
    @Max(value = 12,message = "Enter a valid phone num")
    private Long contactNum;
    private String rType;
}
