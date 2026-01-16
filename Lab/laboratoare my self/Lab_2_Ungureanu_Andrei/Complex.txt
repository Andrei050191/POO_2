
public class Complex {

    // --- Membri privati ---
    private int real;
    private int imaginary;

    // --- Constructor 1: cu doi parametri ---
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // --- Constructor 2: fara parametri (apeleaza primul cu 0,0) ---
    public Complex() {
        this(0, 0);
    }

    // --- Constructor 3: copy constructor ---
    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // --- Getteri ---
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    // --- Setteri ---
    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    // --- Metoda de adunare ---
    public void addWithComplex(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    // --- Metoda de afisare ---
    public void showNumber() {
        System.out.println(real + " + " + imaginary + "i");
    }
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        Complex complex = new Complex(6, 8);
        complex.showNumber();
  }*/
}
