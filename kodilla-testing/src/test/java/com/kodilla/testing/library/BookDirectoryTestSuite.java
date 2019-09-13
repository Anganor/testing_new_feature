package com.kodilla.testing.library;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionReturnList() {
        //Given / Arrange
        //assertTrue(false);
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When / Act
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then / Assert
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //assertTrue(false);
        //Given / Arrange
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When / Act
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then / Assert
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given / Arrange
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When / Act
        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("An");

        //Then / Assert
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhen0Books() {
        //Given / Arrange
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<Book>();
        //LibraryUser libraryUser = new LibraryUser("Someone", "Whatever", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(bookList);

        //When / Act
        List<Book> noBooksList = bookLibrary.listBooksInHandsOf(any(LibraryUser.class));

        //Then / Assert
        assertEquals(0, noBooksList.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
    }

    @Test
    public void testListBooksInHandsOfWHen1Book() {
        //Given / Arrange
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookListOfOne = generateListOfNBooks(1);
        LibraryUser libraryUser = new LibraryUser("Artur", "Whatever", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookListOfOne);

        //When / Act
        List<Book> noBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then / Assert
        assertEquals(1, noBooksList.size());
        verify(libraryDatabaseMock, atLeastOnce()).listBooksInHandsOf(libraryUser);
    }

    @Test
    public void testListBooksInHandsOfWHen5Books() {
        //Given / Arrange
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookListOfOne = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Artur", "Whatever", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookListOfOne);

        //When / Act
        List<Book> noBooksList = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then / Assert
        assertEquals(5, noBooksList.size());
        verify(libraryDatabaseMock, atLeast(1)).listBooksInHandsOf(libraryUser);
    }
}
