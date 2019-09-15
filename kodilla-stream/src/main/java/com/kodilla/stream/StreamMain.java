package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> filteredForumUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthday() < 2000)
                .filter(forumUser -> forumUser.getPublishedPosts() != 0)
                .collect(Collectors.toMap(ForumUser::getUniqueID, forumUser -> forumUser));

        System.out.println("The size of filtered list of the forum users: " + filteredForumUsers.size());
        filteredForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
