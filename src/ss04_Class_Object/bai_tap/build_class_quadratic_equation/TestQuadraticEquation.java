package ss04_Class_Object.bai_tap.build_class_quadratic_equation;

import java.util.Scanner;

class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("First Root: " + quadraticEquation.getRoot1());
            System.out.println("Second Root: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("First root = Second root = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
