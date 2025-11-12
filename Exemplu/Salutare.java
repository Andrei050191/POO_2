package Exemplu;

import java.util.Scanner;

public class Salutare {
    public static void main(String[] args) {
        double number1, number2;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number ");
        number1 = scanner.nextDouble();
        System.out.println("Input second number ");
        number2 = scanner.nextDouble();
        System.out.println("Sum is " + (number1 + number2));
    }
}