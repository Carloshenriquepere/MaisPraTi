package weekFive_ExceptionsDatesGenerics.secondExercise.exceptions;

public class LimitExceededException extends RuntimeException{

    public LimitExceededException(){
       super("Limit exceeded!");
    }
}
