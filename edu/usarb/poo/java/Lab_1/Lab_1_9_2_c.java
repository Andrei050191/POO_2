import java.util.Scanner;

public class Lab_1_9_2_c {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 5-digit natural number: ");
        int number = scanner.nextInt();
        
        if (number < 10_000 || number > 99_999) {
            System.out.println("Error: Number must have exactly 5 digits!");
            scanner.close();
            return;
        }
        
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;
        
        int result = digit1 * 1000 + digit2 * 100 + digit4 * 10 + digit5;
        
        System.out.println("Number after removing middle digit: " + result);
        
        scanner.close();
    }
}

