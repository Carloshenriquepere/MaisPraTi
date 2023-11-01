package weekTwo.thirdExercise.books;

import java.util.Objects;

public class Book {

    public String title;
    public String author;
    public int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                " Title= '" + title + '\'' +
                ", Author= '" + author + '\'' +
                ", Year Published= " + yearPublished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
}
