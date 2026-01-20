import java.util.Scanner;

public class Lab_1_9_2_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: n must be positive!");
            scanner.close();
            return;
        }
        
        int[] vector = new int[n];
        
        System.out.println("Enter " + n + " natural numbers:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }
        
        System.out.println("Right circular permutations:");
        
        for (int shift = 0; shift < n; shift++) {
            for (int i = 0; i < n; i++) {
                int index = (i - shift + n) % n;
                System.out.print(vector[index]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

