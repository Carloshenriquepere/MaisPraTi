package weekEightJavaAndMySQL.challengeWeekEight.repository;

import weekEightJavaAndMySQL.challengeWeekEight.model.Book;
import weekEightJavaAndMySQL.challengeWeekEight.model.StatusBook;

import java.util.List;

public interface Methods<T> {

    public void addBooks(T t);

    public void rentBook(int id);

    public void returnBook(int id);

    public List<Book> seeBookAvailable();

    public List<Book> seeBookRented();
}
