package lt.baltictalents.exercises.e36;

import org.junit.Test;

import static lt.baltictalents.exercises.e36.E36.wordAppend;
import static org.junit.Assert.*;

public class E36Test {

    @Test
    public void testWordAppend() {
        assertEquals("a", wordAppend("a", "b", "a"));
        assertEquals("aa", wordAppend("a", "b", "a", "c", "a", "d", "a"));
        assertEquals("a", wordAppend("a", "", "a"));
    }
}