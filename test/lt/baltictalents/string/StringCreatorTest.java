package lt.baltictalents.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCreatorTest {

    @Test
    public void testCreate() {
        assertEquals("asdasdg",new StringCreator().create("asd", "asdg"));
    }
}