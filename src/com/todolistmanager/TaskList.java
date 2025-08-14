package com.todolistmanager;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskList {
    Task[] arrayTasks;
    LinkedList<Task> linkedTasks;

    public TaskList(int size) {
        arrayTasks = new Task[size];
        linkedTasks = new LinkedList<>();
    }
}
