package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    private Boolean executionOfTask;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Using " + color + ", to paint " + whatToPaint);
        executionOfTask = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return executionOfTask;
    }
}
