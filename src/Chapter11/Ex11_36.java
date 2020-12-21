package Chapter11;

import java.util.Arrays;

//11.36. Дан массив. Напечатать:
//        а) все неотрицательные элементы;
//        б) все элементы, не превышающие число 100.
public class Ex11_36 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 101, 102, 103, 104, -1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(a));
        for (int n : a) {
            if (n > 0) {
                System.out.print(n + " ");
            }

        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 100) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
