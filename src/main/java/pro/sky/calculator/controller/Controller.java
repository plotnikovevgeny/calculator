package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.MathServiceImpl;

@RequestMapping("/calculator")
@RestController
public class Controller {
    private final MathServiceImpl mathService;

    public Controller(MathServiceImpl mathService) {
        this.mathService = mathService;
    }

    @RequestMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String getSum(@RequestParam Long num1, @RequestParam Long num2) {
        return mathService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String getDifference(@RequestParam Long num1, @RequestParam Long num2) {
        return mathService.getDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam Long num1, @RequestParam Long num2) {
        return mathService.getMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam Long num1, @RequestParam Long num2) {
        return mathService.getDivide(num1, num2);
    }
}
