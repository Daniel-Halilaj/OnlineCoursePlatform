package main.java.services;

import main.java.models.Enrollment;
import main.java.models.Student;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(Enrollment enrollment) {
        enrollments.add(enrollment);
        enrollment.getStudent().enroll(enrollment);
        System.out.println("Student enrolled in: " + enrollment.getCourse().getTitle());
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}