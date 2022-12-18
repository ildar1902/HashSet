package driver;

public class StringUtils {
    private StringUtils() {    }
     public static boolean isNotEmpty(String s) {
        return s != null && !s.isEmpty() && !s.isBlank();
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty() || s.isBlank();
    }
}
