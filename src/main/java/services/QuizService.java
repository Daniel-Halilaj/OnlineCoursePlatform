package main.java.services;

import main.java.models.Enrollment;
import main.java.models.Question;
import main.java.models.Quiz;

import java.util.List;

public class QuizService {

    public double takeQuiz(Quiz quiz, List<String> answers) {
        List<Question> questions = quiz.getQuestions();

        int total = questions.size();
        if (total == 0) return 0.0;

        int correct = 0;
        for (int i = 0; i < total; i++) {
            String ans = (i < answers.size()) ? answers.get(i) : "";
            if (questions.get(i).checkAnswer(ans)) {
                correct++;
            }
        }

        return (correct * 100.0) / total;
    }

    public double takeQuizAndUpdateProgress(Enrollment enrollment, Quiz quiz, List<String> answers, double passScore) {
        double score = takeQuiz(quiz, answers);

        if (score >= passScore) {
            double newProgress = Math.min(100.0, enrollment.getProgress() + 20.0);
            enrollment.updateProgress(newProgress);
        }

        return score;
    }

    public boolean isPassed(double score, double passScore) {
        return score >= passScore;
    }
}
