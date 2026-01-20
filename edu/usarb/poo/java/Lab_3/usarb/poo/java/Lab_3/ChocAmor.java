package usarb.poo.java.Lab_3;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor() {
        super();
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor length: " + length);
    }

    @Override
    public void printDimensions() {
        printChocAmorDim();
    }

    @Override
    public String toString() {
        return "The " + super.toString() + " has volume " + getVolume();
    }
}

