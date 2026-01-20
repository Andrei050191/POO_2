import java.util.Scanner;

public class Lab_1_9_2_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: n must be positive!");
            scanner.close();
            return;
        }
        
        int[] numbers = new int[n];
        
        System.out.println("Enter " + n + " natural numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int bestNumerator = 0;
        int bestDenominator = 1;
        double maxFraction = 0.0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i] < numbers[j]) {
                    double fraction = (double) numbers[i] / numbers[j];
                    if (fraction > maxFraction) {
                        maxFraction = fraction;
                        bestNumerator = numbers[i];
                        bestDenominator = numbers[j];
                    }
                }
            }
        }
        
        if (bestDenominator == 1 && bestNumerator == 0) {
            System.out.println("No proper fraction found!");
        } else {
            System.out.println("Largest proper fraction: " + bestNumerator + "/" + bestDenominator);
        }
        
        scanner.close();
    }
}

