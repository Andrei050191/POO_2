import java.util.Scanner;

public class Lab_1_9_2_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Introdu " + n + " numere naturale:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        // afisam n permutari circulare la dreapta
        for (int k = 0; k < n; k++) {   // de n ori
            // afisam permutarea curenta
            for (int i = 0; i < n; i++) {
                System.out.print(v[i] + " ");
            }
            System.out.println();

            // rotire circulara la dreapta cu 1 pozitie
            int ultimul = v[n - 1];
            for (int i = n - 1; i > 0; i--) {
                v[i] = v[i - 1];
            }
            v[0] = ultimul;
        }
    }
}
