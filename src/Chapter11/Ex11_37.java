package Chapter11;

import java.util.Arrays;

//11.37. Дан массив целых чисел. Напечатать:
//        а) все четные элементы;
//        б) все элементы, оканчивающиеся нулем.
public class Ex11_37 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 11, 13, 14, 15, 16, 200, 17, -2, -3, -4, 10, 20};
        System.out.println(Arrays.toString(a));
        for (int n : a) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        for (int n : a) {
            if (n % 10 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
