import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String args[]) {
        Locale locale = Locale.forLanguageTag("ng-NG"); // or Locale.GERMANY
        NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
        String formatted = nft.format(1000000);
        System.out.println(formatted);
    }
}