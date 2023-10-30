package WeekOne.ExerciseSecond;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("Entre com um número: ");
        score = sc.nextInt();

       do {
           System.out.println(score);
           score++;
       }while (score < 6);
        System.out.println("Fim da contagem:");
    }
}
