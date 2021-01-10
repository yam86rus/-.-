package Chapter11;

import java.util.Arrays;

//11.56. Определить сумму второго, четвертого, шестого и т. д. элементов массива.
public class EX11_56 {
    static void foo(int[] array) {
        int result = 0;
        for (int i = 1; i < array.length; i += 2) {
            result += array[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(ar));
        foo(ar);
    }
}
