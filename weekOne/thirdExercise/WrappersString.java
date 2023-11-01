package weekOne.thirdExercise;

import java.util.Scanner;

public class WrappersString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberUser;

        System.out.print("Digite um número: ");
        numberUser = sc.nextInt();

        Integer numberUserWrapper = numberUser;

        Integer outroObejto = numberUser;

        if(numberUserWrapper == outroObejto){
            System.out.println("== - É igual:");
        }else {
            System.out.println("== - Não é igual:");
        }

        if(numberUserWrapper.equals(outroObejto)){
            System.out.println("Equals - É igual:");
        }else {
            System.out.println("Equals - Não é igual:");
        }



    }
}
