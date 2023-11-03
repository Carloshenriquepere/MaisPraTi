package weekFive_ExceptionsDatesGenerics.secondExercise.books;

public class Book {

    private String name;
    private boolean borrowed;

    public Book(String name) {
        this.name = name;
        this.borrowed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed() {
        if (borrowed){
            this.borrowed = false;
        }else {
            this.borrowed = true;
        }
    }

    @Override
    public String toString() {
        return "Book " + "name= " + name +  ", Is it on loan? " + isBorrowed() + "\n" ;
    }
}
