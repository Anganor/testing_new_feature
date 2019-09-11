package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.*;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test //#1
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test //#2
    public void testAddComment() {
        //Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        //Act
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");
        //Assert
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test //#3
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test //#4
    public void testGetComment() {
        //Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //Act
        ForumComment retrievedComment = forumUser.getComment(0);
        //Assert
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test //#5
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    @Test //#6
    public void testRemoveCommentNotExisting() {
        //Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        //Act
        boolean result = forumUser.removeComment(theComment);
        //Assert
        Assert.assertFalse(result);
    }

    @Test //#7
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test //#8
    public void testRemoveComment() {
        //Arrange
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //Act
        boolean result = forumUser.removeComment(theComment);
        //Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
