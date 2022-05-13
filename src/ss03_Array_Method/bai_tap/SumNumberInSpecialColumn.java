package ss03_Array_Method.bai_tap;

import java.util.Scanner;

public class SumNumberInSpecialColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int raw = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int col = scanner.nextInt();

        int[][] array2d = new int[raw][col];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử vào mảng: " + "\t");
                array2d[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2d[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Cột muốn tính tổng: ");
        int sumCol = 0;
        int numCol = scanner.nextInt();
        for (int i = 0; i < raw; i++) {
            sumCol = sumCol + array2d[i][numCol];
        }
        System.out.println("Tổng cột " + numCol + " là " + sumCol);
    }
}
