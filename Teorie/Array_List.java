package Teorie;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
   
    ArrayList<String> cars = new ArrayList<>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");  


    System.out.println("Lista initiala este"+ cars);
    
    for (int i = 0; i < cars.size(); i++) {
        if (cars.get(i).equals("Volvo")) {
            cars.set(i, "Volvo XC90");
        }
    }
    
    System.out.println("Lista finala este"+ cars);

    for (String car : cars) {
        System.out.println(car);
        if (car.equals("Volvo XC90")) {
            car = "Volvo";
            
        }
    }
    System.out.println("Lista a revenit la ce initiala"+ cars);
}}
