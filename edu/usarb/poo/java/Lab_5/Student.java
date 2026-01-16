package usarb.poo.java.Lab_5;


import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Task 1: compareTo - compare by averageGrade, then surname, then name
    @Override
    public int compareTo(Student other) {
        // First compare by average grade
        int gradeCompare = Double.compare(this.averageGrade, other.averageGrade);
        if (gradeCompare != 0) {
            return gradeCompare;
        }

        // If grades are equal, compare by surname
        int surnameCompare = this.surname.compareTo(other.surname);
        if (surnameCompare != 0) {
            return surnameCompare;
        }

        // If surnames are equal, compare by name
        return this.name.compareTo(other.name);
    }

    // Task 4: equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
