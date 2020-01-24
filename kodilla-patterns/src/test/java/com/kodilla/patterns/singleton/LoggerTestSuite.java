package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void openLogFile() {
        System.out.println("Opening log file.");
    }

    @AfterClass
    public static void closeLogFile() {
        System.out.println("Closing log file.");
    }

    @Test
    public void testGetLastLog() {
        // Given / Arrange
        Logger.getInstance().log("TESTS");

        // When / Act
        String lastLog = Logger.getInstance().getLastLog();

        // Then / Assert
        Assert.assertEquals(lastLog, "TESTS");
    }

    @Test
    public void testLogsLength() {
        // Given / Arrange
        Logger.getInstance().log("TESTS");
        Logger.getInstance().log("DUPLICATES");
        Logger.getInstance().log("QUESTIONS");

        // When / Act
        int lengthOfLastLog = Logger.getInstance().getLastLog().length();

        // Then / Assert
        Assert.assertEquals(lengthOfLastLog, 9);
    }
}
