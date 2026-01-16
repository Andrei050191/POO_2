
package usarb.poo.java.Lab_5;

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare pentru Student si EvenLinkedHashSet
        Student s1 = new Student("Ana", "Popescu", 1, 9.5);
        Student s2 = new Student("Ion", "Ionescu", 2, 8.7);
        System.out.println(s1);
        System.out.println(s2);

        EvenLinkedHashSet set = new EvenLinkedHashSet();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(7);
        System.out.println("Setul de numere pare: " + set);
    }
}


