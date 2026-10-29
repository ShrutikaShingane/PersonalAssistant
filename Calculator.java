import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public void calculate(double num1, double num2, String operation) {
        try {
            double result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /");
            }
            System.out.println("Result: " + result);
            logger.info("Calculation successful: " + num1 + " " + operation + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
            logger.warning("Math Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
            logger.warning("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            logger.severe("Unexpected Error: " + e.getMessage());
        }
    }
}