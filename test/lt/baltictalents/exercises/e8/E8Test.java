package lt.baltictalents.exercises.e8;

import org.junit.Test;

import static org.junit.Assert.*;

public class E8Test {

    /*  System.out.println(unlucky1(new int[]{1, 3, 4, 5})); //true
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5})); //true
        System.out.println(unlucky1(new int[]{1, 1, 1})); //false
        System.out.println(unlucky1(new int[]{1, 2, 5, 1, 3})); //true
        System.out.println(unlucky1(new int[]{})); //false
        System.out.println(unlucky1(null)); //false */

    @Test
    public void testUnlucky1() {
        assertTrue(E8.unlucky1(new int[]{1, 3, 4, 5}));
        assertTrue(E8.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertFalse(E8.unlucky1(new int[]{1, 1, 1}));
        assertTrue(E8.unlucky1(new int[]{1, 2, 5, 1, 3}));
        assertFalse(E8.unlucky1(new int[]{}));
        assertFalse(E8.unlucky1(null));

    }
}