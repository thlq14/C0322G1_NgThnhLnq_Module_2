package ss03_Array_Method.bai_tap;

import java.util.Scanner;

public class CountNumberOfCharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "dem so lan xuat hien cua ki tu chuoi";
        char[] arr = string.toCharArray();
        System.out.print("Nhập kí tự muốn tìm: ");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (array[0] == arr[i]) {
                count++;
            }
        }
        System.out.println("Chuỗi: " + string);
        System.out.println("Kí tự " + str + " xuất hiện " + count + " lần.");
    }
}
