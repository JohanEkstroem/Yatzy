package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    Dice yatzi = new Dice();

    @Test
    void isYatziWhenAllDiceMatches() {
        int[] dices = new int[] { 1, 1, 1, 1, 1 };
        boolean result = yatzi.checkDices(dices);
        assertEquals(true, result);

    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        int[] dices = new int[] { 1, 2, 3, 4, 5 };
        boolean result = yatzi.checkDices(dices);
        assertEquals(false, result);
    }

    @Test
    void populatedDicesArrayIsNotNull() {
        assertNotNull(yatzi.getDicesValue()[0]);
    }
}
