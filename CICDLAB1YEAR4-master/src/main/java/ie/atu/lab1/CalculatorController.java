package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalculationResult calculate(
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("operation") String operation) {

        double total = 0.0;
        String operationType = "";

        switch (operation.toLowerCase()) {
            case "add":
                total = num1 + num2;
                operationType = "add";
                break;
            case "subtract":
                total = num1 - num2;
                operationType = "subtract";
                break;
            case "multiply":
                total = num1 * num2;
                operationType = "multiply";
                break;
            case "divide":
                if (num2 != 0) {
                    total = num1 / num2;
                    operationType = "divide";
                } else {
                    return new CalculationResult("error", "Division by zero is not allowed.");
                }
                break;
            default:
                return new CalculationResult("error", "Invalid operation type: " + operation);
        }

        return new CalculationResult(operationType, total);
    }
}
