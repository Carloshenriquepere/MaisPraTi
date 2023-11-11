package weekFive_ExceptionsDatesGenerics.challengeWeekFive.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private String code;
    private String name;
    private String checkIn;
    private String checkOut;
    private int room;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public long bookedDays(String code){
        LocalDate dateEntry = LocalDate.parse(checkIn, formatter);
        LocalDate departureDate = LocalDate.parse(checkOut, formatter);
        if (dateEntry != null && departureDate != null){
            return ChronoUnit.DAYS.between(dateEntry, departureDate);
        }else {
            return 0;
        }
    }

    public Reservation(String code, String name, String checkIn, String checkOut, int room) {
        this.code = code;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "\n Code: " + code +
                ",\n Name: " + name +
                ",\n Date Entry: " + checkIn +
                ",\n Departure Date: " + checkOut +
                ",\n Room: " + room;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
