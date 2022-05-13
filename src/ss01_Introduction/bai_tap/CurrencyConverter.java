package ss01_Introduction.bai_tap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền VND: ");
        usd = sc.nextDouble();
        double convert = usd * 23000;
        System.out.println("Giá trị VND: " + convert);
    }
}
