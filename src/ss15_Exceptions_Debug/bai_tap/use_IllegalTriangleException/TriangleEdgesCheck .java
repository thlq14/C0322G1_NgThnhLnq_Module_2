//package ss15_exceptions_debug.bai_tap.use_IllegalTriangleException;
//
//import java.util.Scanner;
//public class MainClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Khai bao doi tuong
//        TriangleEdgesCheck check = new TriangleEdgesCheck();
//        // Nhap du lieu
//        try {
//            System.out.print("Nhap vao canh thu nhat: ");
//            int a = sc.nextInt();
//            System.out.print("Nhap vao canh thu hai: ");
//            int b = sc.nextInt();
//            System.out.print("Nhap vao canh thu ba: ");
//            int c = sc.nextInt();
//            try {
//                check.checkTriangleEdges(a, b, c);
//            } catch (TriangleEdgesException ex) {
//                System.out.println(ex.getMessage());
//            }
//        } catch (Exception e) {
//            System.out.println("Sai: khong dung dinh dang!");
//        }
//
//        sc.close();
//    }
//}
//public class TriangleEdgesException extends Exception {
//    // Ham khoi tao
//    public TriangleEdgesException(String str) {
//        super(str);
//    }
//}
//
//public class TriangleEdgesCheck {
//    // Ham kiem tra tam giac hop le
//    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
//        if (a + b <= c || a + c <= b || b + c <= a) {
//            throw new TriangleEdgesException("Loi: Tam giac khong hop le!");
//        } else {
//            System.out.println("Tam giac hop le!");
//        }
//    }
//}
