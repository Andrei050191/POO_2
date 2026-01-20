package usarb.poo.java.Lab_3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CandyBag giftBag = new CandyBag();

        CandyBox lindtClassic = new Lindt("LINDOR", "Switzerland", 10f, 5f, 3f);
        CandyBox lindtClassicDuplicate = new Lindt("LINDOR", "Switzerland", 10f, 5f, 3f);
        CandyBox lindtDark = new Lindt("Excellence", "Switzerland", 8f, 4f, 2f);
        CandyBox baravelli = new Baravelli("Gianduiotto", "Italy", 4f, 12f);
        CandyBox chocAmor = new ChocAmor("Spiced", "Belgium", 6f);

        giftBag.addCandyBox(lindtClassic);
        giftBag.addCandyBox(lindtClassicDuplicate);
        giftBag.addCandyBox(lindtDark);
        giftBag.addCandyBox(baravelli);
        giftBag.addCandyBox(chocAmor);

        System.out.println("Bag contains " + giftBag.size() + " boxes.");
        System.out.println("lindtClassic equals lindtClassicDuplicate? " + lindtClassic.equals(lindtClassicDuplicate));
        System.out.println("lindtClassic equals lindtDark? " + lindtClassic.equals(lindtDark));

        Area deliveryArea = new Area(giftBag, 42, "Strada Florilor");
        deliveryArea.getBirthdayCard();
    }
}