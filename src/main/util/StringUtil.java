package main.util;

/**
 *
 * @author Windy
 */
public class StringUtil {

    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
