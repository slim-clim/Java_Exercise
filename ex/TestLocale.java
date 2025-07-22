import java.util.Locale;
import java.util.Properties;

public class TestLocale {
    public static void main(String args[]) {
        Properties defaultMessages = new Properties();
        defaultMessages.setProperty("message", "Welcome");

        Properties germanMessages = new Properties();
        germanMessages.setProperty("message", "Willkommen");

        Properties chineseMessages = new Properties();
        chineseMessages.setProperty("message", "歡迎");

        Locale l1 = Locale.of("de", "DE");
        Properties messages = getMessagesForLocale(l1, defaultMessages, germanMessages, chineseMessages);
        System.out.println(messages.getProperty("message"));

        Locale l2 = Locale.of("zh", "CN");
        messages = getMessagesForLocale(l2, defaultMessages, germanMessages, chineseMessages);
        System.out.println(messages.getProperty("message"));
    }

    private static Properties getMessagesForLocale(Locale locale, Properties defaultMessages, Properties germanMessages, Properties chineseMessages) {
        if (locale.getLanguage().equals("de")) {
            return germanMessages;
        } else if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            return chineseMessages;
        } else {
            return defaultMessages;
        }
    }
}