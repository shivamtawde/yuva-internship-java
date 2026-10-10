import java.util.Scanner;
import java.util.InputMismatchException;

public class s59impleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("===============================");
        System.out.println("   Welcome to Java Calculator  ");
        System.out.println("===============================");

        while (keepRunning) {
            try {
                // 1. Get user input
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                // 2. Perform calculation using a switch statement
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        // 3. Handle a common pitfall: Division by zero
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero!");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator! Please use +, -, *, or /.");
                        continue; // Skips the rest of the loop and starts over
                }

                // 4. Print the result
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

            } catch (InputMismatchException e) {
                // 5. Handle common pitfall: User enters text instead of a number
                System.out.println("Error: Invalid input. Please enter numbers only.");
                scanner.nextLine(); // Clears the bad input from the scanner
            } catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            }

            // 6. Ask if they want to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }

        System.out.println("Exiting calculator. Goodbye!");
        scanner.close(); // Good practice to close the scanner
    }
}