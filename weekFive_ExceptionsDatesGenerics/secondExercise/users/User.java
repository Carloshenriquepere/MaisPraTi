package weekFive_ExceptionsDatesGenerics.secondExercise.users;

import weekFive_ExceptionsDatesGenerics.secondExercise.books.Book;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String name;

    public User() {
    }

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

    public Set<Book> getBooksRented(User user){

        return booksRented;
    }
}
