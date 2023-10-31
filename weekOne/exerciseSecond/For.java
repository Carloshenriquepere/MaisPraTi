package weekOne.exerciseSecond;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Digite o Multiplicador: ");
        number = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int multiplication = i * number;
            System.out.println(number + " X " + i + " = " + multiplication);

        }
    }
}
