package by.bsuir.task16;

import by.bsuir.task14_15.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorComparatorTests {

    @Test
    @DisplayName("Author comparator")
    void authorComparator() {
        ArrayList<Book> books = new ArrayList<>(
                Arrays.asList(new Book("title", "author1", 10, 879979879),
                        new Book("title", "author", 10, 879979879))
        );
        ArrayList<Book> sortedList = new ArrayList<>( Arrays.asList(new Book("title", "author", 10, 879979879),
                new Book("title", "author1", 10, 879979879)));

        books.sort(new BookAuthorComparator());

        assertEquals(books, sortedList);
    }

    @Test
    @DisplayName("Title comparator")
    void titleComparator() {
        ArrayList<Book> books = new ArrayList<>(
                Arrays.asList(new Book("title1", "author1", 10, 879979879),
                        new Book("title", "author", 10, 879979879))
        );
        ArrayList<Book> sortedList = new ArrayList<>( Arrays.asList(new Book("title", "author", 10, 879979879),
                new Book("title1", "author1", 10, 879979879)));

        books.sort(new BookTitleComparator());

        assertEquals(books, sortedList);
    }

    @Test
    @DisplayName("Price comparator")
    void priceComparator() {
        ArrayList<Book> books = new ArrayList<>(
                Arrays.asList(new Book("title1", "author1", 1000, 879979879),
                        new Book("title", "author", 10, 879979879))
        );
        ArrayList<Book> sortedList = new ArrayList<>( Arrays.asList(new Book("title", "author", 10, 879979879),
                new Book("title1", "author1", 1000, 879979879)));

        books.sort(new BookAuthorComparator());

        assertEquals(books, sortedList);
    }
}