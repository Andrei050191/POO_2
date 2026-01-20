package usarb.poo.java.Lab_3;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0f;
    }

    public void printDimensions() {
        System.out.println("Generic candy box with no specific dimensions.");
    }

    @Override
    public String toString() {
        return origin + " " + flavor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandyBox)) {
            return false;
        }
        CandyBox other = (CandyBox) obj;
        return Objects.equals(flavor, other.flavor) && Objects.equals(origin, other.origin);
    }
}

