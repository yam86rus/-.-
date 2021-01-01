package Chapter11;

import java.util.Arrays;

//11.50. Дан массив вещественных чисел.
//        а) Из всех положительных элементов вычесть элемент с номером k1,
//        из всех отрицательных — число n. Нулевые элементы оставить без изменения.
//        б) Ко всем нулевым элементам прибавить n, из всех положительных эле-ментов
//        вычесть a, ко всем отрицательным прибавить b.
public class Ex11_50 {
    static void foo(int[] array, int k1, int n) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] -= k1;
            } else {
                array[i] -= n;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, -4, 5};

        int k1 = a[1];
        int n = 3;
        foo(a, k1, n);
    }
}
