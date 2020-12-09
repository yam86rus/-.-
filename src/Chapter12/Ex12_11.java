package Chapter12;

import java.util.Arrays;

//12.11. Дан двумерный массив. Найти:
//        а) сумму элементов, расположенных в левом верхнем и правом нижнем углах;
//        б) среднее арифметическое элементов, расположенных в четырех углах.
public class Ex12_11 {
    public static int foo1(int[][] array) {
        return array[0][0] + array[array.length - 1][array[array.length - 1].length - 1];
    }

    public static double foo2(double[][] array) {
        double n1 = array[0][0];
        double n2 = array[0][array[0].length - 1];
        double n3 = array[array.length - 1][0];
        double n4 = array[array.length - 1][array[array.length - 1].length - 1];
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {2, 4, 6}, {4, 7}, {22, 33, 44, 5, 2}};
        System.out.println("Первый массив");
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма элементов расположенных в левом верхнем и правом нижнем углах: " + foo1(array));

        double[][] array2 = {{1, 3, 5}, {2, 4, 6}, {4, 7}, {22, 33, 44, 5, 2}};
        System.out.println("Второй массив");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("Cреднее арифметическое элементов, расположенных в четырех углах: " + foo2(array2));
    }
}
