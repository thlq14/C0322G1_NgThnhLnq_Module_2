package ss19_String_Regex.bai_tap.validate_class_name;

import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        String regex = "[C|A|P][0-9]{4}[G|H|I|K|L|M]";
        String nameClass = "C0318G";

        boolean checkName = Pattern.matches(regex, nameClass);
        if (checkName) {
            System.out.println(nameClass + " hợp lệ.");
        } else {
            System.out.println(nameClass + " KHÔNG hợp lệ.");
        }
    }
}
