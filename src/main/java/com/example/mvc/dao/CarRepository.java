package com.example.mvc.dao;

import com.example.mvc.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();

    void save(Car car);

    void delete(Integer id);

    Car findById(Integer id);
}
