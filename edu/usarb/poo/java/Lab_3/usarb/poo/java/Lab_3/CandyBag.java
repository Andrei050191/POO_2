package usarb.poo.java.Lab_3;

import java.util.ArrayList;
import java.util.List;

public class CandyBag {
    private final List<CandyBox> boxes;

    public CandyBag() {
        this.boxes = new ArrayList<>();
    }

    public void addCandyBox(CandyBox box) {
        boxes.add(box);
    }

    public int size() {
        return boxes.size();
    }

    public List<CandyBox> getBoxes() {
        return boxes;
    }
}

