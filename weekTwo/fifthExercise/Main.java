package weekTwo.fifthExercise;

import weekTwo.fifthExercise.calculator.Calculations;

public class Main {
    public static void main(String[] args) {

        System.out.println(Calculations.add(10,10));
        System.out.println(Calculations.subtract(15,10));
        System.out.println(Calculations.multiplication(10,2));
        System.out.println(Calculations.division(10,100));
        System.out.println(Calculations.multiplication(10,Calculations.PI));
    }
}
