package weekEight_JavaAndMySQL.challengeWeekEight.repository;

import weekEight_JavaAndMySQL.challengeWeekEight.model.Book;

import java.util.List;

public interface Methods<T> {

    public void addBooks(T t);

    public void rentBook(int id);

    public void returnBook(int id);

    public List<Book> seeBookAvailable();

    public List<Book> seeBookRented();
}
