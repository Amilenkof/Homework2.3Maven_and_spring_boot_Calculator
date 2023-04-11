package pro.homework23.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {




    public int plus(int num1,int num2) {
        return num1 + num2;
    }

    public int minus(int num1,int num2) {
        return num1 - num2;
    }

    public int multiply(int num1,int num2) {
        return num1 * num2;
    }

    public String divide(int num1,int num2) {
        if (num2 == 0) {
            return "Деление на 0!";
        }
        double s=((double) num1) /((double) num2);
        return String.format("%s", s);
    }
}
