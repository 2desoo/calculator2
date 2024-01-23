package calculator.sky.pro.test.skycalculatordemotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping(path = "/calculator")
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping("calculator/plus")
    public String plusCalculator(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        return calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping("calculator/minus")
    public String minusCalculator(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        return calculatorService.minusCalculator(num1, num2);
    }

    @GetMapping("calculator/multiply")
    public String multiplyCalculator(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }

    @GetMapping("calculator/divide")
    public String divideCalculator(
            @RequestParam(required = false) Integer num1,
            @RequestParam(required = false) Integer num2) {
        return calculatorService.divideCalculator(num1, num2);
    }


}

