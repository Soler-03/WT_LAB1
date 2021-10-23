package Classes_and_Objects.BookTask.Sorts;

import Classes_and_Objects.BookTask.Book;

import java.util.Comparator;

public class SortByTitleThenAuthor implements Comparator<Book> {

    private Comparator<Book> comparator;

    public SortByTitleThenAuthor() {

        comparator = new SortByTitle().thenComparing(new SortByAuthor());
    }


    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return comparator.compare(book1, book2);
    }
}