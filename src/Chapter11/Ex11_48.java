package Chapter11;

import java.util.Arrays;

//11.48. Дан массив вещественных чисел.
//        а) Из всех положительных элементов вычесть элемент с номером k1, из ос-тальных — элемент с номером k2.
//        б) Все элементы с нечетными номерами увеличить на 1, с четными — уменьшить на 1.
public class Ex11_48 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -4, 5};
        System.out.println(Arrays.toString(a));
        int k1 = 1, k2 = 3;
        int n1 = a[k1];
        int n2 = a[k2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i] = a[i] - n1;
            } else {
                a[i] = a[i] - n2;
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i]=a[i]+1;
            } else {
                a[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
