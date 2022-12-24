package io.github.lucasefdr.fundamentals.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.lucasefdr.fundamentals.SquareDigit;

public class SquareDigitTest {
    @Test
    public void testCase1() {
        assertEquals(811181, SquareDigit.squareDigits(9119));
        assertEquals(0, SquareDigit.squareDigits(0));
    }
}
