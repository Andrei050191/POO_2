package com.example.university.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.model.Course;
import com.example.university.model.Student;
import com.example.university.service.UniversityService;

@RestController
@RequestMapping("/api/university")
public class UniversityController {
    
    private final UniversityService service;

    public UniversityController(UniversityService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course c) {
        return service.addCourse(c);
    }

    @PostMapping("/enroll")
    public String enroll(@RequestParam Long studentId, @RequestParam Long courseId) {
        return service.enrollStudent(studentId, courseId);
    }

    @GetMapping("/students/{id}/courses")
    public List<Course> getStudentCourses(@PathVariable Long id) {
        Student s = service.getStudentById(id);
        if (s != null) {
            return s.getEnrolledCourses();
        }
        return null;
    }
}