package usarb.poo.java.Lab_3;


public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
        this(new CandyBag(), 0, "");
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public CandyBag getCandyBag() {
        return candyBag;
    }

    public void setCandyBag(CandyBag candyBag) {
        this.candyBag = candyBag;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Delivery address: " + street + " " + number);
        System.out.println("La multi ani, mama!");
        for (CandyBox box : candyBag.getBoxes()) {
            System.out.println(box.toString());
            box.printDimensions();
        }
    }
}

