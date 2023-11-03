package weekOne_IntroductionToJava.secondExercise;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Entre com o número: ");
        number = sc.nextInt();

        if (number > 0){
            System.out.println("Número é positivo");
        }else {
            System.out.println("Número é negativo:");
        }
    }
}
