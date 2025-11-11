package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.*;
import ru.neoflex.practice.model.Result;
import ru.neoflex.practice.repository.CalculationRepository;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalcController {

    private final CalculationRepository repository;

    public CalcController(CalculationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable int a, @PathVariable int b) {
        int result = a + b;
        repository.save(new Result(null, "plus", a, b, result));
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable int a, @PathVariable int b) {
        int result = a - b;
        repository.save(new Result(null, "minus", a, b, result));
        return result;
    }

    @GetMapping("/all")
    public List<Result> getAll() {
        return repository.findAll();
    }
}

