package com.example.mvc.dto;

import com.example.mvc.model.CarType;
import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.*;
import java.util.Map;
import java.util.TreeMap;

@Data

//1) Имя машины состоит из 2х английских слов(марка и модель) и не пустое
//2) Пробег не больше 200000 км и не пустой
//3) Тип авто не пустой
//4) id инструктора должен быть не пустым и не больше 50
//5) Кол-во студентов не пустое и не более 500
//6) Цена за курс не менее 10000 и не пустое
//7) Цена за 1 поездку не менее 500 и не пустое

public class SaveCarDto {
    private Integer id;
    @NotBlank(message = "Название не может быть пустым")
    @Pattern(regexp = "\\w+\\s+\\w+", message = "название должно быть в формате: /марка /модель английскими буквами")
    private String name;
    @Max(value = 200000, message = "не больше 200000")
    @NotNull(message = "пробег должен быть задан")
    private Integer mileage;
    @NotBlank(message = "тип не должен быть пустым")
    private String type;
    private Map<String, String> carTypes = new TreeMap<>();
    @NotNull(message = "поле должно быть заполнено")
    @Max(value = 50, message = "не больше 50")
    private Integer instructorId;
    @NotNull(message = "поле должно быть заполнено")
    @Max(value = 500, message = "не более 500")
    private Integer studentsCount;
    @NotNull(message = "поле должно быть заполнено")
    @Min(value = 10000,message = "не менее 10000")
    private Integer allPrice;
    @NotNull(message = "поле должно быть заполнено")
    @Min(value = 500, message = "минимум 500")
    private Float pricePerTrip;

    public SaveCarDto() {
        setCarTypes();
    }

    public SaveCarDto(Integer id, String name, Integer mileage, String type) {
        this(); //переадресация на пустой конструктор данного объекта
        this.id = id;
        this.name = name;
        this.mileage = mileage;
        this.type = type;
//        setCarTypes();
    }


    private void setCarTypes() {
        carTypes.put(CarType.COUPE.name(), "coupe");
        carTypes.put(CarType.HATCHBACK.name(), "hatchback");
        carTypes.put(CarType.SEDAN.name(), "sedan");
        carTypes.put(CarType.LIFTBACK.name(), "liftback");
    }

}
