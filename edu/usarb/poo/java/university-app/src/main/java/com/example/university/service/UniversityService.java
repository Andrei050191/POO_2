package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.model.Course;
import com.example.university.model.Student;

@Service
public class UniversityService {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private Long nextStudentId = 1L;
    private Long nextCourseId = 1L;

    public UniversityService() {
        addCourse(new Course(null, "Java Programming", "Invatam Spring Boot"));
        addCourse(new Course(null, "Baze de Date", "Invatam SQL"));
        
        addStudent(new Student(null, "Alexandru", "alex@test.com"));
        addStudent(new Student(null, "Elena", "elena@test.com"));
    }

    public Student addStudent(Student s) {
        Student newS = new Student(nextStudentId++, s.getName(), s.getEmail());
        students.add(newS);
        return newS;
    }

    public List<Student> getAllStudents() { return students; }

    public Student getStudentById(Long id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public Course addCourse(Course c) {
        Course newC = new Course(nextCourseId++, c.getTitle(), c.getDescription());
        courses.add(newC);
        return newC;
    }

    public List<Course> getAllCourses() { return courses; }

    public Course getCourseById(Long id) {
        return courses.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    public String enrollStudent(Long studentId, Long courseId) {
        Student s = getStudentById(studentId);
        Course c = getCourseById(courseId);

        if (s == null || c == null) {
            return "Studentul sau Cursul nu exista!";
        }

        if (s.getEnrolledCourses().contains(c)) {
            return "Studentul este deja inscris la acest curs.";
        }

        s.enrollInCourse(c);
        return "Succes! " + s.getName() + " a fost inscris la " + c.getTitle();
    }
}