package weekFour_ArraysCollections.firstExercise;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean gameFinished = false;

        char[][] board = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        char currentPlayer = 'X';

        do {
            //Board display
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);

                    if (j < 2){
                        System.out.print(" | ");
                    }
                }

                System.out.println();
                if (i < 2){
                    System.out.println("----------");
                }
            }
            System.out.println();

            System.out.println("Player "+currentPlayer +" it's your turn");
            int positionChosen = sc.nextInt();

            if (positionChosen < 1 || positionChosen > 9){
                System.out.println("Invalid position!");
                continue;
            }

            switch (positionChosen){
                case 1:
                    board[0][0] = currentPlayer;
                    break;
                case 2:
                    board[0][1] = currentPlayer;
                    break;
                case 3:
                    board[0][2] = currentPlayer;
                    break;
                case 4:
                    board[1][0] = currentPlayer;
                    break;
                case 5:
                    board[1][1] = currentPlayer;
                    break;
                case 6:
                    board[1][2] = currentPlayer;
                    break;
                case 7:
                    board[2][0] = currentPlayer;
                    break;
                case 8:
                    board[2][1] = currentPlayer;
                    break;
                case 9:
                    board[2][2] = currentPlayer;
                    break;

            }

            for (int i = 0; i < 3; i++) {
                //Comparing the lines
                if (board[i][0] == currentPlayer && board[i][1] ==currentPlayer && board[i][2] == currentPlayer) {
                    System.out.println("Player "+currentPlayer+" is the winner!");
                    gameFinished = true;
                    break;
                }
                //Comparing the columns
                if (board[0][i] == currentPlayer && board[1][i] ==currentPlayer && board[2][i] == currentPlayer) {
                    System.out.println("Player "+currentPlayer+" is the winner!");
                    gameFinished = true;
                    break;
                }
            }
            //Comparing the diagonals
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer){
                System.out.println("Player "+currentPlayer+" is the winner!");
                gameFinished = true;
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer){
                System.out.println("Player "+currentPlayer+" is the winner!");
                gameFinished = true;
            }

            if (!gameFinished) {
                gameFinished = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] != 'X' && board[i][j] != 'O') {
                            gameFinished = false;
                        }
                    }
                }
            }

            if (gameFinished){
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j]);

                        if (j < 2){
                            System.out.print(" | ");
                        }
                    }

                    System.out.println();
                    if (i < 2){
                        System.out.println("----------");
                    }
                }
                System.out.println();
            }
            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';


        }while (!gameFinished);

    }
}
