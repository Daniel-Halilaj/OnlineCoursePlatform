package main.java.models;

public class Lesson {
    private int id;
    private String title;
    private String content;

    public Lesson(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
}

