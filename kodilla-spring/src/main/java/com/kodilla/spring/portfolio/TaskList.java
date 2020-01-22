package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Adding new task to the list: " + task);
    }

    public void removeTask(String task) {
        System.out.println("Removing a task: \"" + task + "\", from the list.");
        tasks.remove(task);
    }
}
