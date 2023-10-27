package by.bsuir.task16;

import by.bsuir.task14_15.Book;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.getAuthor().compareTo(b.getAuthor());
    }
}
