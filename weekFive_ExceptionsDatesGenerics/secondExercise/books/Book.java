package weekFive_ExceptionsDatesGenerics.secondExercise.books;

import weekFive_ExceptionsDatesGenerics.secondExercise.users.User;

public class Book  extends User {

    private String nameBook;
    private boolean borrowed;

    public Book(String nameBook) {
        this.nameBook = nameBook;
        this.borrowed = false;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setName(String name) {
        this.nameBook = nameBook;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed() {
        this.borrowed = !borrowed;
    }

    @Override
    public String toString() {
        return "Book " + "name= " + nameBook +  ", Is it on loan? " + isBorrowed() + "\n" ;
    }
}
