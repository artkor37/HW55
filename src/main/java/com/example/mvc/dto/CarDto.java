package com.example.mvc.dto;

import com.example.mvc.model.CarType;
import lombok.*;

import javax.persistence.Column;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarDto {

    private Integer id;
    private String name;
    private Integer mileage;
    private String type;
    private Integer instructorId;
    private Integer studentsCount;
    private Integer allPrice;
    private Float pricePerTrip;

}
