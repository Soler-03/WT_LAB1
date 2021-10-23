package Classes_and_Objects.BookTask;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(Book book, String language, int level) {
        super(book.getTitle(), book.getAuthor(), book.getPrice(), book.getIsbn());

        if (language == null || language.isEmpty()) {
            throw new IllegalArgumentException("Необходимо указать язык");
        }

        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook programmerBook;
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        programmerBook = (ProgrammerBook) obj;
        return super.equals(obj) && language != null && language.equals(programmerBook.language) && programmerBook.level == level;
    }

    @Override
    public int hashCode() {
        final int PRIME = 11;
        int result = 1;
        result = PRIME * result + ((language == null) ? 0 : language.hashCode());
        result = PRIME * result + super.hashCode();
        result = PRIME * result + level;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " language: " + language + " level: " + level;
    }

}
