package ss19_String_Regex.bai_tap.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        String regexPhoneNumber = "[0-9]{2}-[0][0-9]{9}";
        System.out.println("Nhập SĐT Cần Kiểm Tra: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();

        boolean checkPhone = Pattern.matches(regexPhoneNumber, phone);
        if (checkPhone) {
            System.out.println("SĐT: " + phone + " hợp lệ.");
        } else {
            System.out.println("SĐT: " + phone + " KHÔNG hợp lệ.");
        }
    }
}
