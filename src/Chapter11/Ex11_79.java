package Chapter11;

import java.util.Arrays;

//11.79. Дан массив вещественных чисел. Выяснить:
//        а) верно ли, что количество положительных элементов не превышает 5;
//        б) верно ли, что количество элементов, которые не больше 50,55, кратно четырем
public class Ex11_79 {
    static boolean foo(int[] array) {
        return Arrays.stream(array).filter(e -> e > 0).count() <= 5 ? true : false;
    }

    boolean foo2(int[] array) {
        return Arrays.stream(array).filter(e -> e <= 55).count() % 4 == 0 ? true : false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -5, -6, -7, -8, -9, -10};
        int[] array2 = {4,4,4,4};
        System.out.println("a) " + foo(array));
        System.out.println("б) " + new Ex11_79().foo2(array2));
    }
}
