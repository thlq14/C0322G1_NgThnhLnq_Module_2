package ss19_String_Regex.bai_tap.validate_phone_number;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        String regexPhoneNumber = "[0-9]{2}-[0][0-9]{9}";
        String phone = "84-0978489648";

        boolean checkPhone = Pattern.matches(regexPhoneNumber, phone);
        if (checkPhone) {
            System.out.println(phone + " là sđt hợp lệ.");
        } else {
            System.out.println(phone + " KHÔNG phải là sđt hợp lệ.");
        }
    }
}
