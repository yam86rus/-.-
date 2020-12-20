package Chapter12;

import java.util.Arrays;

//12.14. Дан двумерный массив. Составить программу:
//        а) расчета суммы двух любых элементов второй строки массива;
//        б) расчета произведения двух любых элементов пятого столбца массива.
public class Ex12_14 {
    static int foo(int[][] ar, int n1, int n2) {
        return ar[1][n1] + ar[1][n2];
    }

    static int foo1(int[][] arr, int n1, int n2) {
        return arr[n1][4] * arr[n2][4];
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {4, 5, 6, 7, 8, 9}, {7, 8, 9, 10, 11, 12}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(foo(array, 0, 1));
        System.out.println(foo1(array, 0, 1));
    }

}
