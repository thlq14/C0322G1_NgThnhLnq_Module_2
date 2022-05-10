package ss02_Loop.bai_tap;

public class ShowPrimeLess100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            boolean flag = true;
            if (i < 2) {
                flag = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
