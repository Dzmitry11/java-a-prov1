package se.dzmitry.prov1;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Prov1DiceGame {



    public static int rollDice() {
        Random dice = new Random();//System.in);
        int dice1 = dice.nextInt(6) + 1;
        //int dice2 = dice.nextInt(6) + 1;
        return dice1;// + dice2;
    }

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Dice Game!");

        System.out.println("Player1 input your name");

        String player1Name = scanner.nextLine();
        Players player1 = new Players( player1Name, 30);


        System.out.println("Player2 input your name");
        String player2Name = scanner.nextLine();

        Players player2 = new Players( player2Name, 25);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Welcome to Dice game: " + player1Name + " " + player2Name);



        int player1firstroll = rollDice();
        int player1secondroll = rollDice();
        int player1Total = player1firstroll + player1secondroll;
        System.out.println(player1Total);

        //"Player rolled:" + player1firstroll + "and + player1secondroll + " (Total:
        //" + player1Total +)");

        int player2firstroll = rollDice();
        int player2secondroll = rollDice();
        int player2Total = player2firstroll + player2secondroll;
        System.out.println(player2Total);
        //"Player rolled:" + player2firstroll + "and + player2secondroll + " (Total:
        //" + player2Total +")");

        if (player1Total > player2Total) {
            System.out.println("Player 1 wins");
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("nobody wins");

        }
    }
}


