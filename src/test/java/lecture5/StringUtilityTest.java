package lecture5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilityTest {

    @Test
    public void testIsVowels() throws Exception {
        boolean result = StringUtility.isVowels("aaabbb");
        assertTrue(result);
    }

    @Test
    public void testIsNonVowels() throws Exception {
        boolean result = StringUtility.isVowels("bbb");
        assertFalse(result);
    }

    @Test
    public void testIsVowelsE() throws Exception {
        boolean result = StringUtility.isVowels("e");
        assertTrue(result);
    }

    @Test
    public void testIsVowelsSpecial() throws Exception {
        boolean result = StringUtility.isVowels("%&*()!@#$и");
        assertFalse(result);
    }

    @Test
    public void testIsVowelsNull() throws Exception {
        boolean result = StringUtility.isVowels(null);
        assertFalse(result);
    }

    @Test
    public void testIsVowelsEmpty() throws Exception {
        boolean result = StringUtility.isVowels("");
        assertFalse(result);
    }
}
