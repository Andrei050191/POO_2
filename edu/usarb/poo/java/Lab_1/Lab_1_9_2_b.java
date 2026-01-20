import java.util.Scanner;

public class Lab_1_9_2_b {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers (0 to stop):");
        
        int sum = 0;
        int count = 0;
        int number;
        
        do {
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);
        
        if (count == 0) {
            System.out.println("No numbers entered!");
        } else {
            double average = (double) sum / count;
            System.out.println("Arithmetic mean: " + average);
        }
        
        scanner.close();
    }
}

