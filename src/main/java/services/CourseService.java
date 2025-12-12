package main.java.services;

import main.java.models.Course;
import main.java.models.Instructor;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getTitle());
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Course> getCoursesByInstructor(Instructor instructor) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getInstructor().equals(instructor)) {
                result.add(course);
            }
        }
        return result;
    }
}
