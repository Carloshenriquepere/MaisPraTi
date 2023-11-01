package weekOne.fourthExercise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int option;
        int numberOne;
        int numberTwo;

        do {
            System.out.println("Menu da Calculadora:");
            System.out.println("1 - Multiplicação:");
            System.out.println("2 - Divisão:");
            System.out.println("3 - Adição:");
            System.out.println("4 - Subtração:");
            System.out.println("5 - Sair:");

            //OPÇÃO SELECIONADA PELO USUARIO
            System.out.print("Digite a opçao desejada: ");
            option = sc.nextInt();

            //VALIDAÇÃO DAS OPÇÕES
            switch (option){
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    numberOne = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    numberTwo = sc.nextInt();
                    int resultMultiplication = numberOne * numberTwo;
                    System.out.println( "Resultado é: " + resultMultiplication);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    numberOne = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    numberTwo = sc.nextInt();
                    int resultDivision = numberOne / numberTwo;
                    System.out.println("Resultado é: " + resultDivision);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    numberOne = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    numberTwo = sc.nextInt();
                    int resultAddition = numberOne + numberTwo;
                    System.out.println("Resultado é: " + resultAddition);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    numberOne = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    numberTwo = sc.nextInt();
                    int resultSubtraction = numberOne - numberTwo;
                    System.out.println("Resultado é: " + resultSubtraction);
                    break;
            }

        } while (option != 5);
    }
}
