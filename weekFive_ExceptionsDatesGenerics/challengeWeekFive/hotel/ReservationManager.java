package weekFive_ExceptionsDatesGenerics.challengeWeekFive.hotel;

import weekFive_ExceptionsDatesGenerics.challengeWeekFive.exception.ConflictingReservationException;
import weekFive_ExceptionsDatesGenerics.challengeWeekFive.repositories.Repository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ReservationManager implements Repository<Reservation> {

   public Set<Reservation> reservations = new HashSet<>();

   public Set<Reservation> getReservations(){
       return reservations;
   }


    @Override
    public void toAdd(Reservation reservation) throws ConflictingReservationException {
        for (Reservation r : reservations){
            if (r.getCode().equalsIgnoreCase(reservation.getCode())){
                throw new ConflictingReservationException();
            }
        }
        reservations.add(reservation);
    }

    @Override
    public Reservation remove(String code) {
    Iterator<Reservation> iterator = reservations.iterator();
    while (iterator.hasNext()) {
        Reservation reservation = iterator.next();
        if (reservation.getCode().equals(code)) {
            iterator.remove();
            return reservation;
        }
    }
    return null;
}

    @Override
    public Reservation search(String code) {
       for (Reservation reservation : reservations){
           if (reservation.getCode().equalsIgnoreCase(code)){
               return reservation;
           }
       }
        return null;
    }


}
