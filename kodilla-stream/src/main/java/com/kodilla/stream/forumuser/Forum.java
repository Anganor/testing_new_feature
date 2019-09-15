package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "Anganor", 'M', LocalDate.of(1989, 10, 5), 666));
        forumUsersList.add(new ForumUser(2, "Turin", 'M', LocalDate.of(2000, 10, 5), 101));
        forumUsersList.add(new ForumUser(3, "Brandir", 'M', LocalDate.of(1998, 10, 5), 0));
        forumUsersList.add(new ForumUser(4, "Finbar", 'M', LocalDate.of(2005, 10, 5), 205));
        forumUsersList.add(new ForumUser(5, "Kementari", 'F', LocalDate.of(2000, 10, 5), 20));
        forumUsersList.add(new ForumUser(6, "Vana", 'F', LocalDate.of(1991, 10, 5), 2));
        forumUsersList.add(new ForumUser(7, "Angi", 'M', LocalDate.of(2001, 10, 5), 76));
        forumUsersList.add(new ForumUser(8, "Luthlorien", 'F', LocalDate.of(1990, 10, 30), 125));
        forumUsersList.add(new ForumUser(9, "sexibomb", 'M', LocalDate.of(2004, 1, 12), 457));
        forumUsersList.add(new ForumUser(10, "kalafior96", 'F', LocalDate.of(1996, 12, 25), 0));
        forumUsersList.add(new ForumUser(11, "agabuga", 'M', LocalDate.of(1998, 7, 3), 0));
        forumUsersList.add(new ForumUser(12, "!@#$%^", 'M', LocalDate.of(1991, 9, 5), 478));
        forumUsersList.add(new ForumUser(13, "BlossomInTheWinter", 'F', LocalDate.of(1991, 2, 7), 68));
        forumUsersList.add(new ForumUser(14, "Anganor89", 'M', LocalDate.of(1949, 7, 8), 45));
        forumUsersList.add(new ForumUser(15, "Howdy", 'M', LocalDate.of(2006, 11, 5), 128));
        forumUsersList.add(new ForumUser(16, "NotAFemale", 'F', LocalDate.of(1988, 3, 1), 332));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(forumUsersList);
    }

}
