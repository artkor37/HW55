package com.example.mvc.service;

import com.example.mvc.dao.CarRepository;
import com.example.mvc.dto.CarDto;
import com.example.mvc.dto.SaveCarDto;
import com.example.mvc.model.Car;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public List<CarDto> findAll() {
        List<Car> cars = carRepository.findAll();
        return cars
                .stream()
                .map(e->modelMapper.map(e,CarDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void save(SaveCarDto saveCarDto) {
        Car car = modelMapper.map(saveCarDto,Car.class);
        carRepository.save(car);
    }
}
