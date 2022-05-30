package ss19_String_Regex.bai_tap.validate_class_name;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        String regex = "[C|A|P][0-9]{4}[G|H|I|K|L|M]";
        System.out.println("Nhập Tên Lớp Cần Kiểm Tra: ");
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.nextLine();

        boolean checkName = Pattern.matches(regex, nameClass);
        if (checkName) {
            System.out.println("Lớp " + nameClass + " hợp lệ.");
        } else {
            System.out.println("Lớp " + nameClass + " KHÔNG hợp lệ.");
        }
    }
}
