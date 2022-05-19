package ss11_DSA_Stack_Queue.bai_tap.count_word_use_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWordinString {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Chuỗi: ");
        String str = scanner.nextLine();
        char[] chars = str.toLowerCase().toCharArray();
        int value;
        for (char item : chars) {
            if (map.containsKey(item)) {
                value = map.get(item) + 1;
                map.put(item, value);
            } else {
                value = 1;
                map.put(item, value);
            }
        }
        System.out.println(map);
    }
}
