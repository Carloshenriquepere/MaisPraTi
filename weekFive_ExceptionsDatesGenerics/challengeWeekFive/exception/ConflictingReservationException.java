package weekFive_ExceptionsDatesGenerics.challengeWeekFive.exception;

public class ConflictingReservationException extends RuntimeException{

    public ConflictingReservationException(){
        super("Error, Existing reservation!");
    }
}
