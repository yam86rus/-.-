package Chapter11;

import java.util.Arrays;

//11.49. Дан массив вещественных чисел.
//        а) Ко всем отрицательным элементам прибавить элемент с номером m1, к остальным — элемент с номером m2.
//        б) Все элементы с четными номерами удвоить, с нечетными — уменьшить на 1.
public class Ex11_49 {
    static void foo(int[] array, int n1, int n2) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] += n1;
            } else {
                array[i] += n2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a = {-1, 2, -3, 4, -5};
        int m1 = a[1];
        int m2 = a[2];
        foo(a, m1, m2);
    }
}
