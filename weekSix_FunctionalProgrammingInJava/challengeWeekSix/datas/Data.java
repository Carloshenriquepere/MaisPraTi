package weekSix_FunctionalProgrammingInJava.challengeWeekSix.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

    private int identifier;
    private double value;
    private String category;
    private String date;


    public Data(int identifier, double value, String category, String date) {
        this.identifier = identifier;
        this.value = value;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Data:" +
                "\n Identifier: " + identifier +
                "\n Value= " + value +
                "\n Category: " + category +
                "\n Date: " + date ;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public void dates(){
        if (date != null){
            LocalDate localDate = LocalDate.parse(date, formatter);
        }
    }



    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public double getValue() {
        return value;
    }


    public void setValue(double value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
