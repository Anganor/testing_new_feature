package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;
    int usersAmount;
    int postsAmount;
    int commentsAmount;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {
        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();

        if(usersAmount > 0) {
            avgPostsPerUser = postsAmount / usersAmount;
        } else {
            avgPostsPerUser = 0;
        }
        if(usersAmount > 0) {
            avgCommentsPerUser = commentsAmount / usersAmount;
        } else {
            avgCommentsPerUser = 0;
        }
        if(postsAmount > 0) {
            avgCommentsPerPost = commentsAmount / postsAmount;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    void showStatistics() {
        System.out.println("The average posts per user is: " + avgPostsPerUser);
        System.out.println("The average comments per user is: " + avgCommentsPerUser);
        System.out.println("The average comments per post is: " + avgCommentsPerPost);
    }
}
