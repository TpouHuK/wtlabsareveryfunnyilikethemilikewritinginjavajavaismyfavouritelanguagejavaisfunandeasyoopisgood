package by.bsuir.task14_15;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("Test clone() method")
    void testClone() {
        Book book = new Book("title", "author", 10, 879979879);

        Book clonedBook = book.clone();

        assertEquals(clonedBook, book);
    }
}