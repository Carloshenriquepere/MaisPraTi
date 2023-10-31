package weekOne.exerciseSecond;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score;

        System.out.print("Entre com um número: ");
        score = sc.nextInt();

        while (score > 0){
            System.out.println(score);
            score--;
        }

    }
}
