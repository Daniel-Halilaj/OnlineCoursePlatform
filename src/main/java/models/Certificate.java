package main.java.models;


public class Certificate {
    private Student student;
    private Course course;

    public Certificate(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String generate() {
        return "Certificate: " + student.getName() + " completed " + course.getTitle();
    }
}
