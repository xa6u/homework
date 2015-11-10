package lecture5;

import org.junit.Test;
import static org.junit.Assert.*;

public class HomeWorkStringClassTest {

    @Test
    public void testIsEmpty() throws Exception{
        boolean result = HomeWorkStringClass.emptyStringCheck("");
        assertFalse(result);
    }

    @Test
    public void testIsBlank() throws Exception{
        boolean result = HomeWorkStringClass.emptyStringCheck("     ");
        assertFalse(result);
    }

    @Test
    public void testIsSuccess() throws Exception{
        boolean result = HomeWorkStringClass.emptyStringCheck("dfgdge");
        assertTrue(result);
    }

    @Test
    public void testForNull() throws Exception{
        boolean result = HomeWorkStringClass.emptyStringCheck(null);
        assertFalse(result);
    }

}