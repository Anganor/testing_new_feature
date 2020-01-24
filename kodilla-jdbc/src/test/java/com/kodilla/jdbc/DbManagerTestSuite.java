package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        // Given / Arrange
        DbManager dbManager = DbManager.getInstance();

        // When / Act
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // Then / Assert
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ". " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        // Given / Arrange
        DbManager dbManager = DbManager.getInstance();

        // When / Act
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) FROM POSTS P JOIN USERS U ON U.ID = P.USER_ID GROUP BY U.ID HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        // Then / Assert
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " + rs.getString("LASTNAME") + " published: " + rs.getInt("COUNT(*)") + " posts.");
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1, counter);
    }
}
