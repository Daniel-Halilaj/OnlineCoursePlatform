package main.java.models;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int id;
    private List<Question> questions = new ArrayList<>();

    public Quiz(int id) {
        this.id = id;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int getId() { return id; }
    public List<Question> getQuestions() { return questions; }
}
