package weekThree.thirdExercise;

import weekThree.thirdExercise.calculators.ScientificCalculator;
import weekThree.thirdExercise.calculators.SimpleCalculator;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        System.out.println("----------- Simple Calculator-----------");
        System.out.println(simpleCalculator.addition(2.5,3.5));
        System.out.println(simpleCalculator.subtraction(3.5,6.5));
        System.out.println(simpleCalculator.division(10,5));
        System.out.println(simpleCalculator.multiplication(4,2));
        System.out.println("---------------Scientific Calculator--------------");
        System.out.println( scientificCalculator.exponentiation(12,20));
        System.out.println(scientificCalculator.squareRoot(10));

    }
}
