


public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(float length) {
        super("Chocolate", "France");
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor dimensions -> length: " + length);
    }
}