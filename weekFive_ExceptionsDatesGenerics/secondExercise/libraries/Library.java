package weekFive_ExceptionsDatesGenerics.secondExercise.libraries;

import weekFive_ExceptionsDatesGenerics.secondExercise.books.Book;
import weekFive_ExceptionsDatesGenerics.secondExercise.exceptions.BookUnavailable;
import weekFive_ExceptionsDatesGenerics.secondExercise.exceptions.LimitExceededException;
import weekFive_ExceptionsDatesGenerics.secondExercise.users.User;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> collectionBooks = new ArrayList<>();

    public List<Book> listCollectionBooks(){
        System.out.println("------------------------------");
        System.out.println("Current books!");
        return this.collectionBooks;
    }

    public void addBooks(Book book){
        this.collectionBooks.add(book);
    }

    public void lendBook(Book book, User user) throws BookUnavailable, LimitExceededException{
        try {
            if (book.isBorrowed()){
                throw new BookUnavailable();
            }else {
                pickUpBook(user, book);
                user.getBooksRented(user).add(book);

                System.out.println("Book " + book.getNameBook()+ " was loaned to "+ user.getName());
                System.out.println("----------------------------");
            }

        }catch (LimitExceededException | BookUnavailable e){
            System.out.println("---------------");
            System.out.println("Error when lending " + e.getMessage());
            System.out.println("---------------------");

        }

    }

    public void pickUpBook(User user, Book book){
        if (user.getBooksRented(user).size() < 5){
            user.getBooksRented(user).add(book);
            book.setBorrowed();
        }else {
            throw new LimitExceededException();
        }

    }
}
