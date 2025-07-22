import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale2 {
    public static void main(String args[]) {
        // German locale
        Locale l1 = Locale.of("de", "DE");
        ResourceBundle rb1 = ResourceBundle.getBundle("MessageBundle", l1);
        System.out.println(rb1.getString("message"));

        // Chinese locale
        Locale l2 = Locale.of("zh", "CN");
        ResourceBundle rb2 = ResourceBundle.getBundle("MessageBundle", l2);
        System.out.println(rb2.getString("message"));
    }
}