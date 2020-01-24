package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        // Given / Arrange
        Library library = new Library("Nowojorska Biblioteka Publiczna");
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("book" + n, "unknown" + n, LocalDate.now())));

        // testing if shallow copy works
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Nowojorska Biblioteka Publiczna - duplikat");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // testing if deep copy works
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Nowojorska Biblioteka Publiczna - kopia");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When / Act

        // Then / Assert
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, cloneLibrary.getBooks().size());
        Assert.assertEquals(9, deepClonedLibrary.getBooks().size());
    }
}
