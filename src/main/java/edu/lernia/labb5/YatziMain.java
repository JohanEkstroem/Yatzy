package edu.lernia.labb5;

import java.util.Scanner;

public class YatziMain {

    public static void main(String[] args) {

        Dice yatzi = new Dice();
        int[] dices = yatzi.getDicesValue();
        System.out.println("Welcome to Yatzi!");
        while (yatzi.isBoardGameOn()) {
            if (yatzi.getTurn() <= 3) {

                if (yatzi.checkDices(dices)) {
                    System.out.println("You got YATZI! in" + dices[0] + "'s");
                } else {
                    System.out.println("Want to throw again? (y for yes, anything else for no)");
                    Scanner sc = new Scanner(System.in);
                    if (sc.next().equals("y")) {
                        yatzi.setNextTurn();
                    } else {
                        yatzi.setBoardGameIsOn(false);
                    }
                }
            } else {
                System.out.println("Game over! Want to play again?");
                Scanner sc = new Scanner(System.in);

                if (sc.next().equals("y")) {
                    yatzi.setResetTurn();
                } else {
                    break;
                }
                sc.close();
            }
        }
    }
}