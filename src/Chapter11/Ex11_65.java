package Chapter11;

import java.util.Arrays;

//11.65. В массиве хранятся сведения о количестве осадков,
//        выпавших за каждый день февраля. Определить количество дней,
//        когда осадков не было.
public class Ex11_65 {
    static int foo(int[] array) {
        int result = 0;
        for (int n : array) {
            if (n == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 2, 3, 4, 3, 2, 3, 2, 0, 0, 1, 0, 0, 2, 0};
        System.out.println(Arrays.stream(a).filter(e -> e == 0).count());
        System.out.println(foo(a));
    }
}
