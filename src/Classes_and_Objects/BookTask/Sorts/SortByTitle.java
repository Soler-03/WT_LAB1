package Classes_and_Objects.BookTask.Sorts;

import Classes_and_Objects.BookTask.Book;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1 == null || book2 == null) {
            throw new IllegalArgumentException("Значение книги не должно быть пустым");
        }
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
