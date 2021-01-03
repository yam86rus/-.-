package Chapter11;

import java.lang.reflect.Array;
import java.util.Arrays;

//11.51. Дан массив вещественных чисел.
//        а) Ко всем отрицательным элементам прибавить элемент с номером а1,
//        из всех нулевых вычесть число b. Положительные элементы оставить без изменения.
//        б) Из всех положительных элементов вычесть a, из всех отрицательных вы-честь b,
//        ко всем нулевым элементам прибавить c.
public class Ex11_51 {
    static void foo(int[] array, int a1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] += a1;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] a = {-2, 1, 0, -1, 2};
        System.out.println(Arrays.toString(a));
        foo(a, a[1]);
    }
}
