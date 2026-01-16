


public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli(float radius, float height) {
        super("Chocolate", "Italy");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float)(Math.PI * radius * radius * height);
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli dimensions -> radius: " + radius + ", height: " + height);
    }
}