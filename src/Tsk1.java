import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tsk1 {

    public static boolean dateController(String str) {
        String regex = "^\\d{4}/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01]) (0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        return matcher.matches();

    }
}