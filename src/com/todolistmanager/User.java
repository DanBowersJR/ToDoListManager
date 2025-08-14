package com.todolistmanager;

public class User {
    String name;
    TaskList taskList;

    public User(String name, int taskArraySize) {
        this.name = name;
        this.taskList = new TaskList(taskArraySize);
    }
}
