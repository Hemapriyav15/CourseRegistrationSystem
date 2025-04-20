package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.courseRegister;
import com.example.Course.Registration.System.repository.CourseRepo;
import com.example.Course.Registration.System.repository.courseRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    courseRegisterRepo CourseRegisterRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<courseRegister> enrolledStudents() {
        return CourseRegisterRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        courseRegister CourseRegister = new courseRegister(name, emailId, courseName);
        CourseRegisterRepo.save(CourseRegister);
    }
}