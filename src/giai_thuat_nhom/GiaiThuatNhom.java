package giai_thuat_nhom;

public class GiaiThuatNhom {
    public static void main(String[] args) {
        int n = 5;
        int a = 4;
        int b = 6;
        int e = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n * 2 + 1; j++) {
                if(j == a || j == b) {
                    System.out.print(e);
                } else {
                    System.out.print(" ");
                }
            }
            a--;
            b++;
            e++;
            System.out.println();
        }
        a = 2;
        b = 10;
        e = 4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n * 2 + 1; j++) {
                if (j == a || j == b) {
                    System.out.print(e);
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            e--;
            System.out.println();
        }
    }
}
