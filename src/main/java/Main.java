package main.java;
import main.java.models.*;
import main.java.services.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AuthService authService = new AuthService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        QuizService quizService = new QuizService();
        CertificateService certificateService = new CertificateService();

        Instructor instructor = new Instructor(
                1, "Instructor 1", "instructor@mail.com", "1234"
        );
        Student student = new Student(
                2, "Student 1", "student@mail.com", "pass"
        );

        authService.registerUser(instructor);
        authService.registerUser(student);

        Course course = new Course(
                101, "Java Basics", instructor
        );
        courseService.addCourse(course);

        Enrollment enrollment = new Enrollment(student, course);
        enrollmentService.enrollStudent(enrollment);


        Quiz quiz = new Quiz(1);
        quiz.addQuestion(new Question("Sa është 2 + 2?", "4"));
        quiz.addQuestion(new Question("Keyword për trashëgimi në Java?", "extends"));

        course.addQuiz(quiz);

        double score = quizService.takeQuizAndUpdateProgress(
                enrollment,
                quiz,
                Arrays.asList("4", "extends"),
                60.0
        );

        System.out.println("Quiz score: " + score);
        System.out.println("Progress: " + enrollment.getProgress() + "%");

        if (enrollment.getProgress() >= 100.0) {
            Certificate certificate = new Certificate(student, course);
            certificateService.generateCertificate(certificate);
        } else {
            System.out.println("Course not completed yet.");
        }
    }
}