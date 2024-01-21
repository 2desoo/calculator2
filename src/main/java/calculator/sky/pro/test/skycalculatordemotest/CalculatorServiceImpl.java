package calculator.sky.pro.test.skycalculatordemotest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Hello";
    }

    public String welcomeCalculator() {
        return "Welcome to Calculator";
    }

    public String plusCalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Error";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minusCalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Error";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiplyCalculator(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Error";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divideCalculator(Integer num1, Integer num2) {
        if (num1 == 0 || num2 == 0) {
            return "Error";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }


}
