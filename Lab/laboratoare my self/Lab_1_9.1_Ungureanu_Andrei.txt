import java.util.Scanner;

public class Lab_1_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        char op;

        System.out.print("Introdu primul numar: ");
        a = sc.nextDouble();

        System.out.print("Introdu al doilea numar: ");
        b = sc.nextDouble();

        System.out.print("Introdu operatia (+, -, *, /): ");
        op = sc.next().charAt(0);

        double rezultat;

        switch (op) {
            case '+':
                rezultat = a + b;
                break;
            case '-':
                rezultat = a - b;
                break;
            case '*':
                rezultat = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Eroare: împărțire la zero!");
                    return;
                }
                rezultat = a / b;
                break;
            default:
                System.out.println("Operatie invalida!");
                return;
        }

        System.out.println("Rezultatul este: " + rezultat);
    }
}
