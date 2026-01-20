package com.example.university.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String email;
    
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void enrollInCourse(Course c) {
        enrolledCourses.add(c);
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }
}