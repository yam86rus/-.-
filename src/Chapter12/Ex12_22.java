package Chapter12;
//12.22.Заполнить двумерный массив результатами таблицы умножения(в первой строке должны быть записаны произведения каждого из чисел от 1до 9на 1,
//        во второй — на 2,...,в последней — на 9).

import java.util.Arrays;

public class Ex12_22 {
    static int[][] fillArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
//            a[i][0] = i + 1;
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] ara = new int[9][9];
        fillArray(ara);
//        System.out.println(Arrays.deepToString(ara));
        for (int[] n:ara){
            System.out.println(Arrays.toString(n));
        }

    }
}
