package com.spring.boot.flyway.controller;

import com.spring.boot.flyway.projection.GetAllMinus;
import com.spring.boot.flyway.projection.GetAllPlus;
import com.spring.boot.flyway.service.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping(value = "/plus", params = {"first_input", "second_input"})
    public int plus(@RequestParam("first_input") int firstInput, @RequestParam("second_input") int secondInput) {

        return mathService.plus(firstInput, secondInput);
    }

    @GetMapping(value = "/minus", params = {"first_input", "second_input"})
    public int minus(@RequestParam("first_input") int firstInput, @RequestParam("second_input") int secondInput) {

        return mathService.minus(firstInput, secondInput);
    }

    @GetMapping(value = "/all-plus")
    public List<GetAllPlus> getAllPlus() {

        return mathService.getAllPlus();
    }

    @GetMapping(value = "/all-minus")
    public List<GetAllMinus> getAllMinus() {

        return mathService.getAllMinus();
    }
}
