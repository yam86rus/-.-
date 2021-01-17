package Chapter11;

import java.util.Arrays;

//11.61. Известны данные о количестве осадков, выпавших за каждый день февраля.
//        Верно ли, что по четным числам выпало больше осадков, чем по нечетным?
public class Ex11_61 {
    static boolean foo(double[] array) {
        double res1 = 0;
        double res2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                res1 += array[i];
            } else {
                res2 += array[i];
            }
        }
//        System.out.println(res1);
//        System.out.println(res2);
        return (res1 > res2) ? true : false;
    }

    public static void main(String[] args) {
        double[] feb = {2, 3, 4, 3, 2, 4, 3, 5, 6, 3, 2, 4, 6, 8, 4, 2, 2, 5, 2, 4, 3, 2, 4, 3, 2, 5, 6, 5, 4};
        System.out.println(foo(feb));
    }
}
