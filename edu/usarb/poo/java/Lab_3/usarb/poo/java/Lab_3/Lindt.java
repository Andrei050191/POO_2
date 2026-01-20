package usarb.poo.java.Lab_3;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    public void printLindtDim() {
        System.out.println("Lindt length: " + length + ", width: " + width + ", height: " + height);
    }

    @Override
    public void printDimensions() {
        printLindtDim();
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " has volume " + getVolume();
    }
}

