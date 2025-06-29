package com.example.mvc.controller;

import com.example.mvc.dto.CarDto;
import com.example.mvc.dto.SaveCarDto;
import com.example.mvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
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
    public String saveCar(@Valid @ModelAttribute SaveCarDto saveCarDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-car";
        }
        carService.save(saveCarDto);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteCar(@RequestParam Integer id) {
        carService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update")
    @Transactional
    public String updateCar(@RequestParam Integer id, Model model) {
        SaveCarDto saveCarDto = carService.getById(id);
        model.addAttribute("saveCarDto", saveCarDto);
        return "add-car";
    }
}
