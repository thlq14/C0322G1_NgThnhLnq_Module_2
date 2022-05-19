package ss11_DSA_Stack_Queue.bai_tap.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào Số Thập phân: ");
        int number = scanner.nextInt();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
//        for (int i = 0; number != 0; i++) {
//            stack.push(number % 2);
//            number /= 2;
//        }
        System.out.print("Giá trị Nhị phân là: ");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
//        for (int i = 0; !stack.empty() ; i++) {
//            System.out.print(stack.pop());
//        }
    }
}
