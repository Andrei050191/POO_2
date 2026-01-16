

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
        this.candyBag = new CandyBag();
        this.number = 0;
        this.street = "Unknown";
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Address: " + number + " " + street);
        System.out.println("Happy Birthday!");
        System.out.println(candyBag.toString());
        for (CandyBox box : candyBag.getBoxes()) {
            if (box instanceof Lindt) {
                ((Lindt) box).printLindtDim();
            }
            else if (box instanceof Baravelli) {
                ((Baravelli) box).printBaravelliDim();
            }
            else if (box instanceof ChocAmor) {
                ((ChocAmor) box).printChocAmorDim();
            }
        }
        }
}

