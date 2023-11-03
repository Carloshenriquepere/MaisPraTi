package weekFive_ExceptionsDatesGenerics.firsthExercise;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        try {
            String numberStr = "123a";
            int number = Integer.parseInt(numberStr);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Unable to convert letters to numbers!");
        }

        try {
            Scanner sc = null;
            sc.nextInt();
        } catch (NullPointerException e) {
            System.out.println("Set a valid!");
        }
    }

}
