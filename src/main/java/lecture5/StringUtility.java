package lecture5;

public class StringUtility {

    public static boolean isVowels(String str) {
        if (str == null) {
            return false;
        }
        char[] chars = str.toCharArray();
        for (char c : chars) {
           if ("eyuioa".indexOf(c) >= 0) {
               return true;
           }
        }
        return false;
    }
}
