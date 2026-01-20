import java.util.Scanner;

public class Lab_1_9_2_a {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: n must be positive!");
            scanner.close();
            return;
        }
        
        System.out.print("Enter number 1: ");
        double min = scanner.nextDouble();
        
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            if (number < min) {
                min = number;
            }
        }
        
        System.out.println("Minimum value: " + min);
        
        scanner.close();
    }
}

