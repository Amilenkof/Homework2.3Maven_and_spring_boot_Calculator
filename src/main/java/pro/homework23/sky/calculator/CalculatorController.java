package pro.homework23.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String plusService(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%s +%s = %s", num1, num2, calculatorService.plus(num1,num2));
    }

    @GetMapping("/minus")
    public String minusService(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%s - %s = %s", num1, num2, calculatorService.minus(num1,num2));
    }


    @GetMapping
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping("/multiply")
    public String multiplyService(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%s * %s = %s", num1, num2, calculatorService.multiply(num1,num2));
    }

    @GetMapping("/divide")
    public String divideService(@RequestParam int num1, @RequestParam int num2) {
        return String.format("%s / %s = %s", num1, num2, calculatorService.divide(num1,num2));
    }
}
