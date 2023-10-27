package by.bsuir.task16;

import by.bsuir.task14_15.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.getTitle().compareTo(b.getTitle());
    }
}