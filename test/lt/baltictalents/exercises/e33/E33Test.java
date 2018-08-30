package lt.baltictalents.exercises.e33;

import org.junit.Test;

import static org.junit.Assert.*;

public class E33Test {

    @Test
    public void testLove6() {
        assertTrue(E33.love6(6, 4));
        assertFalse(E33.love6(4, 5));
        assertTrue(E33.love6(1, 5));
    }
}