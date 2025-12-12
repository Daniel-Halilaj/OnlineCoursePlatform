package main.java.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String title;
    private Instructor instructor;
    private List<Lesson> lessons = new ArrayList<>();
    private List<Quiz> quizzes = new ArrayList<>();

    public Course(int id, String title, Instructor instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Instructor getInstructor() { return instructor; }
    public List<Lesson> getLessons() { return lessons; }
    public List<Quiz> getQuizzes() { return quizzes; }
}
