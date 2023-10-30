package WeekOne.Challenge;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com seu peso: ");
        float weight = sc.nextFloat();
        System.out.print("Entre com a sua altura: ");
        float height = sc.nextFloat();

        float IMC = weight / (height * height);
        
        if(IMC < 18.5){
            System.out.print("Seu IMC é de: " + IMC + " você está a BAIXO!");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.print("Seu IMC é de: " + IMC + " você está Saudável!");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.print("Seu IMC é de: " + IMC + " você esta com Sobrepeso!");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.print("Seu IMC é de: " + IMC + " você esta em Obesidade grau 1!");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.print("Seu IMC é de: " + IMC + " você esta em Obesidade grau 2!");
        } else if(IMC > 40) {
            System.out.print("Seu IMC é de: " + IMC + " você esta em Obesidade grau 3!");
        }

    }
}
