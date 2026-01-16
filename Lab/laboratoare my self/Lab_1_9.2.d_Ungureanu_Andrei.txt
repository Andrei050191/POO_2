import java.util.Scanner;

public class Lab_1_9_2_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Trebuie cel putin 2 valori.");
            return;
        }

        int[] v = new int[n];
        System.out.println("Introdu " + n + " numere naturale:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        double maxVal = -1.0;
        int num = 0, den = 1;

        // cautam toate perechile (i,j) cu v[i] < v[j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (v[j] == 0) continue;  // nu putem imparti la 0
                if (v[i] < v[j]) {        // subunitar
                    double val = (double) v[i] / v[j];
                    if (val > maxVal) {
                        maxVal = val;
                        num = v[i];
                        den = v[j];
                    }
                }
            }
        }

        if (maxVal < 0) {
            System.out.println("Nu exista fractie subunitara cu valorile date.");
        } else {
            System.out.println("Cel mai mare numar rational subunitar este: "
                               + num + "/" + den);
        }
    }
}
