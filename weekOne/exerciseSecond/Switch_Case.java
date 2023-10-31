package weekOne.exerciseSecond;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("Escolha um número de 1 a 3:");
        option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Você escolheu a Primeira opção");
                break;
            case 2:
                System.out.println("Você escolheu a Segunda opção");
                break;
            case 3:
                System.out.println("Você escolheu a Terceira opção");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
