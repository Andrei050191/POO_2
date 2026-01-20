package usarb.poo.java.Lab_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ion","Popescu", 103, 8.5));
        students.add(new Student("Maria","Ionescu", 101, 9.2));
        students.add(new Student("Andrei","Popescu", 105, 8.5));
        students.add(new Student("Elena","Vasilescu", 102, 7.8));
        students.add(new Student("Alex","Popescu", 104, 8.5));

        Collections.sort(students);

        System.out.println("after sort: \n");

        for (Student s : students) {
            System.out.println(s);
        }

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
                (s1, s2) -> Long.compare(s1.getId(), s2.getId())
        );

        priorityQueue.addAll(students);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        HashMap<Student, LinkedList<String>> studentSubjects = new HashMap<>();

        Student s1 = new Student("Ion","Popescu", 103, 8.5);
        Student s2 = new Student("Maria","Ionescu", 101, 9.2);
        Student s3 = new Student("Andrei","Popescu", 105, 8.5);

        LinkedList<String> subjects1 = new LinkedList<>();
        subjects1.add("Matematica");
        subjects1.add("Fizica");
        subjects1.add("Programare");

        LinkedList<String> subjects2 = new LinkedList<>();
        subjects2.add("Chimie");
        subjects2.add("Biologie");

        LinkedList<String> subjects3 = new LinkedList<>();
        subjects3.add("Informatica");
        subjects3.add("Algoritmica");
        subjects3.add("Baze de date");

        studentSubjects.put(s1, subjects1);
        studentSubjects.put(s2, subjects2);
        studentSubjects.put(s3, subjects3);

        for (Map.Entry<Student, LinkedList<String>> entry : studentSubjects.entrySet()) {
            System.out.println(entry.getKey() +"->"+ entry.getValue());
        }

        EvenLinkedHashSet evenSet = new EvenLinkedHashSet();

        evenSet.add(2);
        evenSet.add(3);
        evenSet.add(4);
        evenSet.add(5);
        evenSet.add(6);
        evenSet.add(8);
        evenSet.add(10);

        List<Integer> mixedNumbers = Arrays.asList(11, 12, 13, 14, 15, 16);
        evenSet.addAll(mixedNumbers);

        Iterator<Integer> iterator = evenSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() +"");
        }

        evenSet.forEach(num -> System.out.print(num +""));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 2, 8, 4, 6));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 2, 8, 4, 6));

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 2, 8, 4, 6));
    }
}
