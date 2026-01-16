


import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> boxes;

    public CandyBag() {
        this.boxes = new ArrayList<>();
    }

    public void addBox(CandyBox box) {
        boxes.add(box);
    }

    public void testEquality() {
        if (boxes.size() >= 2) {
            System.out.println(boxes.get(0).equals(boxes.get(1)));
        }
    }
    public ArrayList<CandyBox> getBoxes() {
        return boxes;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (CandyBox box : boxes) {
            result.append(box.toString()).append("\n");
        }
        return result.toString();
    }
}