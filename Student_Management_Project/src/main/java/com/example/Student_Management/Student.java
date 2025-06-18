package com.example.Student_Management;


import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // ✅ Add getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // ✅ Optional: Add setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ✅ Optional: Add constructor
    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
