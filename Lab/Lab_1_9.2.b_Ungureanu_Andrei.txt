import java.util.Scanner;

public class Lab_1_9_2_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long suma = 0;
        int count = 0;
        int x;

        System.out.println("Introdu numere intregi (0 opreste citirea):");

        while (true) {
            x = sc.nextInt();
            if (x == 0) break;

            suma += x;
            count++;
        }

        if (count == 0) {
            System.out.println("Nu s-au citit valori (in afara de 0).");
        } else {
            double media = (double) suma / count;
            System.out.println("Media aritmetica este: " + media);
        }
    }
}
