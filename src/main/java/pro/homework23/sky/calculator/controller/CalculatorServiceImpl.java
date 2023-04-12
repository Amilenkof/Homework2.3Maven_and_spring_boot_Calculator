package pro.homework23.sky.calculator.controller;

import org.springframework.stereotype.Service;
import service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return num1 / num2;
    }
}

