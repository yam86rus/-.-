package Chapter12;
//12.25. Заполнить двумерный массив так, как представлено на рис. 12.3.

// Первое задание
//    1   2   ... 10
//    11  12  ... 20
//    ... ... ... ...
//    111 112 ... 120

import java.util.Arrays;

public class Ex12_25 {

    public static void main(String[] args) {
        int[][] ar = new int[12][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                ar[j][i] = i + 1 + (j * 10);
            }
        }

        for (int[] n : ar) {
            System.out.println(Arrays.toString(n));
        }
    }
}
