package com.todolistmanager;

public class Main {
    public static void main(String[] args) {
        User user = new User("Daniel");

        // Add tasks
        user.getTaskList().addTask("Finish Java homework");
        user.getTaskList().addTask("Go grocery shopping");
        user.getTaskList().addTask("Workout for 30 minutes");

        // Print tasks
        System.out.println("Tasks for " + user.getName() + ":");
        user.getTaskList().printTasks();

        // Complete a task
        user.getTaskList().markTaskCompleted(1);

        // Print tasks again
        System.out.println("\nAfter marking one task as completed:");
        user.getTaskList().printTasks();
    }
}
