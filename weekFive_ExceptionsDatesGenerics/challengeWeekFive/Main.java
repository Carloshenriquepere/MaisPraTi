package weekFive_ExceptionsDatesGenerics.challengeWeekFive;

import weekFive_ExceptionsDatesGenerics.challengeWeekFive.hotel.Reservation;
import weekFive_ExceptionsDatesGenerics.challengeWeekFive.hotel.ReservationManager;

public class Main {
    public static void main(String[] args) {

        ReservationManager reservationManager = new ReservationManager();

        Reservation reservation1 = new Reservation("01","Eduardo","2023/02/12","2023/02/20",1400);
        Reservation reservation2 = new Reservation("02","Caroline","2020/12/10","2021/01/10",1203);
        Reservation reservation3 = new Reservation("03","Alice","2022/06/01","2023/06/10",123);
        Reservation reservation4 = new Reservation("04","Carlos","2023/03/20","2023/04/01",369);
        Reservation reservation5 = new Reservation("05","Patricia","2023/10/16","2023/11/02",1);
        Reservation reservation6 = new Reservation("05","Graça","2023/10/15","2023/11/01",1);

        reservationManager.toAdd(reservation1);
        reservationManager.toAdd(reservation2);
        reservationManager.toAdd(reservation3);
        reservationManager.toAdd(reservation4);
        reservationManager.toAdd(reservation6);
//        reservationManager.toAdd(reservation5);



        System.out.println("------------------------------");

        System.out.println(reservationManager.search("03"));
        System.out.println(reservationManager.search("01"));


        System.out.println("------------------------------");

        reservationManager.remove("01");
        System.out.println(reservationManager.getReservations());
    }
}
