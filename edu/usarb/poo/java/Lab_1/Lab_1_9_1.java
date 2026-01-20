import java.util.Scanner;

public class Lab_1_9_1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation! Valid operations are: +, -, *, /");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        }
        
        scanner.close();
    }
}