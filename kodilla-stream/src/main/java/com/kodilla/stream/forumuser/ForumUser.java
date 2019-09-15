package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int uniqueID;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int publishedPosts;

    public ForumUser(int uniqueID, String username, char sex, LocalDate birthday, int publishedPosts) {
        this.uniqueID = uniqueID;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.publishedPosts = publishedPosts;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
