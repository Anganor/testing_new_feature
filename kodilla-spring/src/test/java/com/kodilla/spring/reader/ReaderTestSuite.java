package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    public void testRead() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        // When (Act) & Then (Assert)
        reader.read();
    }

    @Test
    public void testConditional() {
        // Given / Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        // When / Act
        boolean book2Exists = context.containsBean("book2");

        // Then / Assert
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
}
