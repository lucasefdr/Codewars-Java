package io.github.lucasefdr.fundamentals.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import io.github.lucasefdr.fundamentals.WhoLikesIt;

public class WhoLikesItTest {
    @Test
    public void testCase1() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Lucas likes this", WhoLikesIt.whoLikesIt("Lucas"));
        assertEquals("Lucas and Eduardo like this", WhoLikesIt.whoLikesIt("Lucas", "Eduardo"));
        assertEquals("Lucas, Eduardo and Paulo like this", WhoLikesIt.whoLikesIt("Lucas", "Eduardo", "Paulo"));
        assertEquals("Lucas, Eduardo and 2 others like this",
                WhoLikesIt.whoLikesIt("Lucas", "Eduardo", "Paulo", "Marcelo"));

    }

    @Test
    public void testCase2() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesItSwitchCase());
        assertEquals("Lucas likes this", WhoLikesIt.whoLikesItSwitchCase("Lucas"));
        assertEquals("Lucas and Eduardo like this", WhoLikesIt.whoLikesItSwitchCase("Lucas", "Eduardo"));
        assertEquals("Lucas, Eduardo and Paulo like this",
                WhoLikesIt.whoLikesItSwitchCase("Lucas", "Eduardo", "Paulo"));
        assertEquals("Lucas, Eduardo and 2 others like this",
                WhoLikesIt.whoLikesItSwitchCase("Lucas", "Eduardo", "Paulo", "Marcelo"));

    }
}