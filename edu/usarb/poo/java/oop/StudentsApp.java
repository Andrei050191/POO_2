package edu.usarb.poo.java.oop;
 
import java.util.Scanner;

public class StudentsApp {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Student's name:");
        student.setName(scanner.nextLine());
        System.out.println("Input Student's avg:");
        student.setAvg(scanner.nextDouble());
        System.out.println("Input gender w/m");
        student.setSex(scanner.next().charAt(0));
        if (student.getAvg()>0){
            student.setAdmitedState(true);
        } else {
            student.setAdmitedState(false);
        }
        student.greatting();


    }

}
