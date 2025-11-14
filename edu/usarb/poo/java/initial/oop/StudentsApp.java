package edu.usarb.poo.java.initial.oop;
 
import java.util.Scanner;

public class StudentsApp {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Student's name:");
        student.name=scanner.nextLine();
        System.out.println("Input Student's avg:");
        student.avg=scanner.nextDouble();
        System.out.println("Input gender w/m");
        student.sex=scanner.next().charAt(0);
        if (student.avg>0){
            student.admitedState=true;
        } else {
            student.admitedState=false;
        }
        student.greatting();


    }

}
