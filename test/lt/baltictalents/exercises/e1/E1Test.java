package lt.baltictalents.exercises.e1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class E1Test {
    @Test
    public void testDoubling() {
        assertEquals("[2, 4, 6]", E1.doubling(Arrays.asList(1, 2, 3)).toString());
        assertEquals("[12, 16, 12, 16, -2]", E1.doubling(Arrays.asList(6, 8, 6, 8, -1)).toString());
        assertEquals("[]", E1.doubling(Collections.emptyList()).toString());
        assertNull("", E1.doubling(null));
    }
}