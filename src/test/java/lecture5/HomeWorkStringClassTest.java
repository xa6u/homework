package lecture5;

import junit.framework.TestCase;
import org.junit.Test;

public class HomeWorkStringClassTest extends TestCase {

    @Test
    public void isEmpty() throws Exception{
        boolean result = HomeWorkStringClass.emptyStringCheck("");
        assertFalse(result);
    }
}