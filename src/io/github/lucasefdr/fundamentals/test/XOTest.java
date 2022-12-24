package io.github.lucasefdr.fundamentals.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.lucasefdr.fundamentals.XO;

public class XOTest {
    @Test
    public void testCase1() {
        assertEquals(true, XO.getXO("xxxooo"));
        assertEquals(false, XO.getXO("xxxoooooo"));
        assertEquals(true, XO.getXO("xxxXoOOo"));
        assertEquals(true, XO.getXO("xxxXXOOOOo"));
        assertEquals(false, XO.getXO("xxxXXooooooO"));
    }
}
