package lt.baltictalents.exercises.e24;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class E24Test {
    @Test
    public void testNoNeg() {
        assertEquals("[1]", E24.noNeg(Arrays.asList(1, -2)).toString());
        assertEquals("[3, 3]", E24.noNeg(Arrays.asList(-3, -3, 3, 3)).toString());
        assertEquals("[]", E24.noNeg(Arrays.asList(-1, -1, -1)).toString());
        assertEquals("[]", E24.noNeg(Collections.emptyList()).toString());
        assertEquals("[0, 2]", E24.noNeg(Arrays.asList(0, -5, 2)).toString());
        assertNull(E24.noNeg(null));
    }
}
