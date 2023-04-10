package pro.homework23.sky.calculator;

public class CalculatorController {
    private int num1;
    private int num2;

    public CalculatorController(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus() {
        return num1 + num2;
    }

    public int minus() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public String divide() {
        if (num2 == 0) {
            return "Деление на 0!";
        }
       double s=((double) num1) /((double) num2);
        return String.format("%s", s);
    }


}
