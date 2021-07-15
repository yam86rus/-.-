package Chapter11;
//11.78. Найти число элементов массива, которые больше своих "соседей", т. е.
//        предшествующего и последующего.

import java.util.Arrays;

public class Ex11_78 {
    static int foo(int[] ar) {
        int result = 0;
        if (ar.length <= 2) return result;
        for (int i = 1; i < ar.length - 1; i++) {
            if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {

                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 5, 4, 3, 7, 6, 5, 4, 8, 5, 6, 0};
        System.out.println(Arrays.toString(array));
        System.out.println("Найдено " + foo(array));
    }
}
