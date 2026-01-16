import java.util.Scanner;

public class Lab_1_9_2_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n trebuie sa fie > 0");
            return;
        }

        System.out.print("x1 = ");
        double x = sc.nextDouble();
        double min = x;   // minimul curent

        for (int i = 2; i <= n; i++) {
            System.out.print("x" + i + " = ");
            x = sc.nextDouble();
            if (x < min) {
                min = x;
            }
        }

        System.out.println("Minimul este: " + min);
    }
}
