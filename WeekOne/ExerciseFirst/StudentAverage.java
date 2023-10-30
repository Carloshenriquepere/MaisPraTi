package WeekOne.ExerciseFirst;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        double note1, note2, average;
        final double noteWeight = 0.5;

        System.out.print("Entre com a primeira nota: ");
        note1 = sc.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        note2 = sc.nextDouble();

        average = (note1 * noteWeight) + (note2 * noteWeight);

        System.out.println("A média é: " + average);



    }
}
