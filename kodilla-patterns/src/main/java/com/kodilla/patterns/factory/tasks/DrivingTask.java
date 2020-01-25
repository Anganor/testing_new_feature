package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private Boolean executionOfTask;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving to " + where + ", by " + using);
        executionOfTask = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return executionOfTask;
    }
}
