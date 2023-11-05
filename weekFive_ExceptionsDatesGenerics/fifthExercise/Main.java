package weekFive_ExceptionsDatesGenerics.fifthExercise;

import weekFive_ExceptionsDatesGenerics.fifthExercise.toCompare.CompareNumbers;

public class Main {
    public static void main(String[] args) {

        CompareNumbers compareNumbers= new CompareNumbers();

        System.out.println(compareNumbers.comparable(20.0,0.36));
        System.out.println(compareNumbers.comparable(2,1));
        System.out.println(compareNumbers.comparable(2.05,13.6));
        System.out.println(compareNumbers.comparable(10,16));
        System.out.println(compareNumbers.comparable(-2,0.2));


    }
}
