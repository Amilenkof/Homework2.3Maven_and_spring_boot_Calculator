package pro.homework23.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
    @GetMapping
    public void hello() {
        System.out.println("<b>Hello</b>");
    }

    @GetMapping(path = "calculator")
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping(path = "calculator/plus")
    public String plusService(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        CalculatorController calculatorController = new CalculatorController(num1, num2);
        return String.format("%s +%s = %s", num1, num2, calculatorController.plus());
    }

    @GetMapping(path = "calculator/minus")
    public String minusService(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        CalculatorController calculatorController = new CalculatorController(num1, num2);
        return String.format("%s - %s = %s", num1, num2, calculatorController.minus());
    }

    @GetMapping(path = "calculator/multiply")
    public String multiplyService(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        CalculatorController calculatorController = new CalculatorController(num1, num2);
        return String.format("%s * %s = %s", num1, num2, calculatorController.multiply());
    }

    @GetMapping(path = "calculator/divide")
    public String divideService(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        CalculatorController calculatorController = new CalculatorController(num1, num2);
        return String.format("%s / %s = %s", num1, num2, calculatorController.divide());
    }
}
