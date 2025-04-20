package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.courseRegister;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Adjust this if needed
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<courseRegister> enrolledStudents() {
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name, emailId, courseName);
        return "Congratulations! " + name + " Enrollment Successful for " + courseName;
    }
}