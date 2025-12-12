package main.java.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private List<Enrollment> enrollments = new ArrayList<>();

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void enroll(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}