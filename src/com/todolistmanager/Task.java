package com.todolistmanager;

public class Task {
    String title;
    String description;
    boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
}
