package weekFive_ExceptionsDatesGenerics.challengeWeekFive.repositories;


import weekFive_ExceptionsDatesGenerics.challengeWeekFive.exception.ConflictingReservationException;

public interface Repository<T> {

     void toAdd(T reservation) throws ConflictingReservationException;

     T remove(String code);

     T search(String code);
}
