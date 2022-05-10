package ss02_Loop.bai_tap;

public class Show20Primes {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;
        System.out.println(20 + " số nguyên tố đầu tiên: ");
        while (count < 20) {
            boolean flag = true;
            if (number < 2) {
                flag = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

