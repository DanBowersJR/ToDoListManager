package com.todolistmanager;

public class TaskList {

    // Node class for linked list
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    // Add a task
    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Mark a task as completed
    public void markTaskCompleted(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                current.task.markAsCompleted();
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Task not found at index: " + index);
    }

    // Print all tasks
    public void printTasks() {
        Node current = head;
        int index = 0;

        while (current != null) {
            System.out.println(index + ": " + current.task);
            current = current.next;
            index++;
        }
    }
}
