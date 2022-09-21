package edu.lernia.labb5;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */
    private int turn = 1;
    private boolean boardGameIsOn = true;

    public void setNextTurn() {
        turn++;
    }

    public int getTurn() {
        return turn;
    }

    public void setResetTurn() {
        turn = 1;
    }

    public boolean isBoardGameOn() {
        return boardGameIsOn;
    }

    public void setBoardGameIsOn(boolean bool) {
        this.boardGameIsOn = bool;
    }

    public boolean checkDices(int[] dices) {
        boolean isSame = true;
        System.out.println("Starting turn " + (getTurn()) + " of 3, rolling dice");
        for (int i = 0; i < dices.length; i++) {
            System.out.println(i + ": " + " Dice shows " + dices[i]);
            if (dices[i] != dices[dices.length - 1]) {
                isSame = false;
            }
        }
        return isSame;
    }

    public void rollDices(int[] dices) {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6 + 1);
        }
    }

}
