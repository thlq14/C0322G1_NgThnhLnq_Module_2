package _Algorithm;

public class SortByHeight {
    int[] solution(int[] arg1) {
        for (int i = 0; i < arg1.length; i++) {
            for (int j = i + 1; j < arg1.length; j++) {
                if (arg1[i] != -1 && arg1[j] != -1) {
                    if (arg1[i] > arg1[j]) {
                        int temp = arg1[i];
                        arg1[i] = arg1[j];
                        arg1[j] = temp;
                    }
                }
            }
        }
        return arg1;
    }
}
