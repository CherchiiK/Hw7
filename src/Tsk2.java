import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tsk2 {

    public static String mailChecker(String str) {
        Pattern p = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z])$");
        Matcher m = p.matcher(str);
        boolean finder = m.matches();
        if (finder) {
            return str.substring(str.lastIndexOf("@") + 1);
        } else {
            return null;
        }
    }
}