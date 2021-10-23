package Classes_and_Objects.BookTask.Sorts;

import Classes_and_Objects.BookTask.Book;

import java.util.Comparator;

public class SortByAuthorThenTitle implements Comparator<Book> {
    Comparator<Book> comparator;

    public SortByAuthorThenTitle() {
        comparator = new SortByAuthor().thenComparing(new SortByTitle());
    }
    @Override
    public int compare(Book book1, Book book2) {
        if (book1 == null || book2 == null) {
            throw new IllegalArgumentException("Значение книги не должно быть пустым");
        }
        return comparator.compare(book1, book2);
    }
}
