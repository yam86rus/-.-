package Chapter12;

import java.util.Arrays;

//12.14. Дан двумерный массив. Составить программу:
//        а) расчета суммы двух любых элементов второй строки массива;
//        б) расчета произведения двух любых элементов пятого столбца массива.
public class Ex12_14 {
    static int foo1(int[][] array, int n1, int n2) {
        return array[1][n1] + array[1][n2];
    }

    static int foo2(int[][] array, int n1, int n2) {
        return array[n1][4]*array[n2][4];
    }

    public static void main(String[] args) {
        int[][] doubleArray = {{1, 2, 3, 4, 5}, {4, 5, 6, 7, 8}, {7, 8, 9, 10, 11}, {10, 11, 12, 13, 14}, {13, 14, 15, 16, 17}};
        System.out.println("Сумма двух элементов второй строки " + foo1(doubleArray, 1, 2));
        System.out.println("Произведение дввух элементов пятого столбца " + foo2(doubleArray, 2,3));
    }
}
