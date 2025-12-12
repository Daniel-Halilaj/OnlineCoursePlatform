package main.java.models;


import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {

    private List<Course> courses = new ArrayList<>();

    public Instructor(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
