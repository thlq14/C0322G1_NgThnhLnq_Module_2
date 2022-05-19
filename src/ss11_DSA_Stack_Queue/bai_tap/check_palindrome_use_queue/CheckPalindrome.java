package ss11_DSA_Stack_Queue.bai_tap.check_palindrome_use_queue;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chuỗi cần kiểm tra: ");
        String inputString = scanner.nextLine().toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            stack.add(inputString.charAt(i));
            queue.add(inputString.charAt(i));

        }
        if (stack.pop().equals(queue.poll())) {
            System.out.println("Đây là chuỗi Palindrome.");
        } else {
            System.out.println("KHÔNG phải chuỗi Palindrome.");
        }
    }
}

//        String reverseString = "";
//        while (!queue.isEmpty()) {
//            reverseString = reverseString + queue.remove();
//        }
//        if (inputString.equals(reverseString)) {
//            System.out.println("Đây là chuỗi Palindrome.");
//        } else {
//            System.out.println("Không phải là chuỗi Palindrome.");
//        }
