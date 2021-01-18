package Chapter11;

import java.util.Arrays;

//11.63. Дан массив. Определить количество неотрицательных элементов.
public class Ex11_63 {
    static int foo1(int[] arr) {
        int result = 0;
        for (int n : arr) {
            if (n > 0) {
                result++;
            }
        }
        return result;
    }

    static int foo2(int[] ar) {
        return (int) Arrays.stream(ar).filter(e -> e > 0).count();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -4, -3, -2, 1, -4};
        System.out.println(foo1(arr));
        System.out.println(foo2(arr));
//        String[] ara = {"f","d","f"};
//        System.out.println(Arrays.stream(ara).filter("f"::equals).count());
    }
}
