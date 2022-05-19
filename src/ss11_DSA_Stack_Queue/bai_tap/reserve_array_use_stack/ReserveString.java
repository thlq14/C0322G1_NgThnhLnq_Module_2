package ss11_DSA_Stack_Queue.bai_tap.reserve_array_use_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReserveString {
    public static void main(String[] args) {
        // Đảo ngược chuỗi.
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Chuỗi muốn đảo: ");
        String mWord = scanner.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i) + "");
        }
        System.out.print("Chuỗi sau khi đảo: ");
        for (int i = 0; i < mWord.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}
