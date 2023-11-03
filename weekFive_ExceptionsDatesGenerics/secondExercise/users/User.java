package weekFive_ExceptionsDatesGenerics.secondExercise.users;

import weekFive_ExceptionsDatesGenerics.secondExercise.books.Book;
import weekFive_ExceptionsDatesGenerics.secondExercise.exceptions.LimitExceededException;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Set<Book> booksRented = new HashSet<>();


    public User(String name) {
        this.name = name;
    }

    public Set<Book> getBooksRented(){

        return booksRented;
    }

    public void pickUpBook(Book book){
        if (booksRented.size() < 5){
            this.booksRented.add(book);
            book.setBorrowed();
        }else {
            throw new LimitExceededException();
        }

    }
}
