package lt.baltictalents.exercises.e25;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class E25Test {

    @Test
    public void testNoYY() {
    /*  System.out.println(noYY(Arrays.asList("a", "b", "c"))); // [ay, by, cy]
        System.out.println(noYY(Arrays.asList("a", "b", "cy"))); // [ay, by]
        System.out.println(noYY(Arrays.asList("xx", "ya", "zz"))); // [xxy, yay, zzy] */

        assertEquals("[ay, by, cy]",E25.noYY(Arrays.asList("a", "b", "c")).toString());
        assertEquals("[ay, by]",E25.noYY(Arrays.asList("a", "b", "cy")).toString());
        assertEquals("[xxy, yay, zzy]",E25.noYY(Arrays.asList("xx", "ya", "zz")).toString());
        assertEquals("[]",E25.noYY(Collections.emptyList()).toString());
        assertNull(E25.noYY(null));

        List<String> result = E25.noYY(Arrays.asList("a", "b", "c"));
        assertEquals(3, result.size());
        assertEquals("ay", result.get(0));
        assertEquals("by", result.get(1));
        assertEquals("cy", result.get(2));
    }
}