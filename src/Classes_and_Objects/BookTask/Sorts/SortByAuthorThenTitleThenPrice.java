package Classes_and_Objects.BookTask.Sorts;

import Classes_and_Objects.BookTask.Book;

import java.util.Comparator;

public class SortByAuthorThenTitleThenPrice implements Comparator<Book> {
    private Comparator<Book> comparator;

    public SortByAuthorThenTitleThenPrice() {
        comparator = new SortByAuthorThenTitle().thenComparing(new SortByPrice());
    }

    @Override
    public int compare(Book book1, Book book2) {
        if (book1 == null || book2 == null) {
            throw new IllegalArgumentException("Значение книги не должно быть пустым");
        }
        return comparator.compare(book1, book2);
    }
}
