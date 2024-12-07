package com.example.mvc.controller;

import com.example.mvc.dto.CarDto;
import com.example.mvc.dto.SaveCarDto;
import com.example.mvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        List<CarDto> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "main-page-car";
    }

    @GetMapping("/add")
    public String getAddPage(Model model) {
        model.addAttribute("saveCarDto", new SaveCarDto());
        return "add-car";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute SaveCarDto saveCarDto) {
        carService.save(saveCarDto);
        return "redirect:/";
    }
}
