package ss11_DSA_Stack_Queue.bai_tap.bracket_in_expression_use_Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Kí tự cần kiểm tra: ");
        String input = scanner.nextLine();
        Stack<Character> bStack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    flag = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (!flag || !bStack.isEmpty() ){
            System.out.println("???");
        } else {
            System.out.println("Well");
        }
    }
}



