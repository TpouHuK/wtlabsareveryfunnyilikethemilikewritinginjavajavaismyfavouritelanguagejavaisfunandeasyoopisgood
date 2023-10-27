package by.bsuir.task16;

import by.bsuir.task14_15.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.getPrice() - b.getPrice();
    }
}