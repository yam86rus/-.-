package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

//11.55. Дан массив целых чисел. Найти:
//        а) сумму нечетных элементов;
//        б) сумму элементов, кратных заданному числу;
//        в) сумму элементов массива, кратных a или b.
public class Ex11_55 {
    static void foo(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i += 2) {
            result += array[i];
        }
        System.out.println(result);
    }

    static void foo1(int[] array, int n1) {
        int result = 0;
        for (int n : array) {
            if (n % n1 == 0) {
                result += n;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ar));
        foo(ar);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента массива");
        int n = scanner.nextInt();
        int n2 = ar[n];
        foo1(ar,n2);

    }
}
