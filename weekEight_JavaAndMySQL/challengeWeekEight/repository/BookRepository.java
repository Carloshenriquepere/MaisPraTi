package weekEight_JavaAndMySQL.challengeWeekEight.repository;

import com.mysql.cj.exceptions.StreamingNotifiable;
import weekEight_JavaAndMySQL.challengeWeekEight.model.Book;
import weekEight_JavaAndMySQL.challengeWeekEight.model.StatusBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements Methods<Book> {

    private final List<Book> bookList;

    private Book book = new Book();

    public BookRepository() {
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    private Connection connection;

    @Override
    public void addBooks(Book book) {
        String sql = "INSERT INTO book(title, author, publicationDate, statusBook) VALUES(?, ?, ?, ?)";
        connection = ConnectBook.getConnectsBook();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublicationDate());
            pstmt.setString(4, "AVAILABLE");

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("Successfully added!");
                bookList.add(book);
            } else {
                System.out.println("Error adding book!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectBook.closeConnectsBook(this.connection);
        }
    }

    @Override
    public void rentBook(int id) {
        String sql = "UPDATE book SET statusBook = ? WHERE id = ?";
        connection = ConnectBook.getConnectsBook();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "RENTED");
            pstmt.setInt(2, id);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Book rented successfully!");
            } else {
                System.out.println("Error when renting the book!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectBook.closeConnectsBook(this.connection);
        }
    }

    @Override
    public void returnBook(int id) {
        String sql = "UPDATE book SET statusBook = ? WHERE id = ?";
        connection = ConnectBook.getConnectsBook();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "AVAILABLE");
            pstmt.setInt(2, id);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Error returning the book!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectBook.closeConnectsBook(this.connection);
        }
    }


    @Override
    public List<Book> seeBookAvailable() {

        List<Book> books = new ArrayList<>();

        String sql = "SELECT * FROM book WHERE book.statusBook = ?";
        connection = ConnectBook.getConnectsBook();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "AVAILABLE");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setPublicationDate(rs.getInt("publicationDate"));
                    book.setStatusBook(StatusBook.valueOf(rs.getString("statusbook")));
                    books.add(book);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectBook.closeConnectsBook(this.connection);
        }
        return books;
    }

    @Override
    public List<Book> seeBookRented() {

        List<Book> books = new ArrayList<>();

        String sql = "SELECT * FROM book WHERE book.statusBook = ?";
        connection = ConnectBook.getConnectsBook();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "RENTED");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Book book = new Book();
                    book.setId(rs.getInt("id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setPublicationDate(rs.getInt("publicationDate"));
                    book.setStatusBook(StatusBook.valueOf(rs.getString("statusbook")));
                    books.add(book);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectBook.closeConnectsBook(this.connection);
        }
        return books;
    }
}
