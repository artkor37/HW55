package com.example.mvc.service;

import com.example.mvc.dto.CarDto;
import com.example.mvc.dto.SaveCarDto;

import java.util.List;

public interface CarService {
    List<CarDto> findAll();

    void save(SaveCarDto saveCarDto);
}
