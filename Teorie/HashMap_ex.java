package Teorie;
import java.util.HashMap; 

public class HashMap_ex {
    public static void main(String[] args) {
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("Initiale: " + capitalCities);

        capitalCities.put("England", "Manchester");
        capitalCities.put("England", "Oslo");

        System.out.println("Modificate: " + capitalCities);

        //for (String citi : capitalCities.keySet()) {
        //    System.out.println("Tara: " + citi + " - Capitala: " + capitalCities.get(citi));
       // }
        for(String citi : capitalCities.keySet()){
            System.out.println("key:" + citi + " value: " + capitalCities.get(citi));
        }
    }
}