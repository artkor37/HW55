package com.example.mvc.dto;

import com.example.mvc.model.CarType;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarDto {

    private Integer id;
    private String name;
    private Integer mileage;
    private CarType type;

}
