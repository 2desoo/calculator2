package calculator.sky.pro.test.skycalculatordemotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @RequestMapping("/calculator")
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @RequestMapping("/calculator/plus")
    public String plusCalculator(Integer num1, Integer num2) {
        return calculatorService.plusCalculator(num1, num2);
    }

    @RequestMapping("/calculator/minus")
    public String minusCalculator(Integer num1, Integer num2) {
        return calculatorService.minusCalculator(num1, num2);
    }

    @RequestMapping("/calculator/multiply")
    public String multiplyCalculator(Integer num1, Integer num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }

    @RequestMapping("/calculator/divide")
    public String divideCalculator(Integer num1, Integer num2) {
        return calculatorService.divideCalculator(num1, num2);
    }


}

