package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {
        int usersAmount = statistics.usersNames().size();
        int postsAmount = statistics.postsCount();
        int commentsAmount = statistics.commentsCount();

        avgPostsPerUser = postsAmount / usersAmount;
        avgCommentsPerUser = commentsAmount / usersAmount;
        avgCommentsPerPost = commentsAmount / postsAmount;
    }

    void showStatistics() {
        System.out.println("The average posts per user is: " + avgPostsPerUser);
        System.out.println("The average comments per user is: " + avgCommentsPerUser);
        System.out.println("The average comments per post is: " + avgCommentsPerPost);
    }
}
