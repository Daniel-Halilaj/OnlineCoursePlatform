package main.java.models;

public class Enrollment {

    private Student student;
    private Course course;
    private double progress = 0.0;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public double getProgress() { return progress; }

    public void updateProgress(double newValue) {
        progress = newValue;
    }
}
