import java.util.Scanner;

public class Lab_1_9_2_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu un numar natural cu 5 cifre: ");
        int n = sc.nextInt();

        if (n < 10000 || n > 99999) {
            System.out.println("Numarul nu are 5 cifre!");
            return;
        }

        int primeleDoua = n / 1000;   // ab
        int ultimeleDoua = n % 100;   // de

        int rezultat = primeleDoua * 100 + ultimeleDoua; // abde

        System.out.println("Numarul dupa eliminarea cifrei din mijloc este: " + rezultat);
    }
}
