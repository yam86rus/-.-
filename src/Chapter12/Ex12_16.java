package Chapter12;

import java.util.Arrays;

//12.16. Составить программу:
//        а) расчета разности двух любых элементов двумерного массива;
//        б) расчета среднего геометрического двух любых элементов двумерного массива.
public class Ex12_16 {
    static double foo1(double[][] array, int n1, int n2, int x1, int x2) {
        return array[n1][n2] - array[x1][x2];
    }

    static double foo2(double[][] array, int n1, int n2, int x1, int x2) {
        return (array[n1][n2] + array[x1][x2]) / 2;
    }

    public static void main(String[] args) {
        double[][] a1 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12, 13}};
        System.out.println(Arrays.deepToString(a1));
        System.out.println(foo1(a1, 0, 3, 1, 3));
        System.out.println(foo2(a1, 0, 2, 1, 1));

    }
}
