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
                user.getBooksRented();
                System.out.println("--------------");
                System.out.println("Book " + book.getName()+ " was loaned to "+ user.getName());
            }

        }catch (LimitExceededException e){
            System.out.println("---------------");
            System.out.println("Error when lending book " + e.getMessage());

        }catch (BookUnavailable e){
            System.out.println("---------------");
            System.out.println("Error when lending book " + e.getMessage());

        }

    }
}
