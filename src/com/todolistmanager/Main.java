package com.todolistmanager;

public class Main {
    public static void main(String[] args) {
        // Create array of users
        User[] users = new User[2];
        users[0] = new User("Daniel");
        users[1] = new User("Alice");

        // Add tasks for Daniel
        users[0].getTaskList().addTask("Finish Java homework");
        users[0].getTaskList().addTask("Go grocery shopping");
        users[0].getTaskList().addTask("Workout for 30 minutes");

        // Add tasks for Alice
        users[1].getTaskList().addTask("Call the bank");
        users[1].getTaskList().addTask("Pay electricity bill");

        // Mark one of Daniel's tasks as completed
        users[0].getTaskList().markTaskCompleted(1); // Mark "Go grocery shopping" done

        // Print all tasks for each user
        for (User user : users) {
            System.out.println("Tasks for " + user.getName() + ":");
            user.getTaskList().printTasks();
            System.out.println();
        }
    }
}
