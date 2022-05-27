package ss15_Exceptions_Debug.bai_tap.use_IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Enter a Triangle Edge 1: ");
                int edge1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a Triangle Edge 2: ");
                int edge2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a Triangle Edge 3: ");
                int edge3 = Integer.parseInt(scanner.nextLine());
                if (edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1
                        || edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
                    throw new IllegalTriangleException("Invalid Triangle.");
                } else {
                    throw new IllegalTriangleException("Valid Triangle.");
                }
            } catch (Exception e) {
                System.out.println("Error: Incorrect Format.");
                System.out.println("Enter Again: ");
                flag = true;
            }
        } while (flag);
    }
}
