package weekFive_ExceptionsDatesGenerics.secondExercise.exceptions;

public class BookUnavailable extends RuntimeException{
    public BookUnavailable (){
        super("Book not available!");
    }
}
