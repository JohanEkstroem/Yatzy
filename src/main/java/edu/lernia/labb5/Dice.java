package edu.lernia.labb5;

public class Dice extends BoardGameMaterial {
    private int[] dices;

    public Dice() {
        dices = new int[5];
        rollDices(dices);
    }

    public int[] getDicesValue() {
        return dices;
    }

}
