package com.example.Course.Registration.System.model;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    // Add any other fields you need

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
