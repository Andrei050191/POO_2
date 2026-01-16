


public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt(float length, float width, float height) {
        super("Chocolate", "Switzerland");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    public void printLindtDim() {
        System.out.println("Lindt dimensions -> length: " + length + ", width: " + width + ", height: " + height);
    }
}
