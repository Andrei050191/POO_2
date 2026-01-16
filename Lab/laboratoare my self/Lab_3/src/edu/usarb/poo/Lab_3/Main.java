



public class Main {
    public static void main(String[] args) {
        Lindt lindtBox = new Lindt(10, 5, 3);
        Baravelli baravelliBox = new Baravelli(3, 8);
        ChocAmor chocAmorBox = new ChocAmor(4);

        CandyBag candyBag = new CandyBag();
        candyBag.addBox(lindtBox);
        candyBag.addBox(baravelliBox);
        candyBag.addBox(chocAmorBox);

        Area area = new Area(candyBag, 123, "Main Street");
        area.getBirthdayCard();
    }
}

