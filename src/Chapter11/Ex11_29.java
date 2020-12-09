package Chapter11;

import java.util.Arrays;

//11.29. Дан массив целых чисел. Выяснить:
//        а) верно ли, что сумма элементов массива есть четное число;
//        б) верно ли, что сумма квадратов элементов массива есть пятизначное число.
public class Ex11_29 {
    static boolean foo1(double[] array) {
        return (Arrays.stream(array).sum() % 2 == 0) ? true : false;
    }

    static boolean foo2(double[] array) {
        return ((int) (Math.pow(Arrays.stream(array).sum(), 2)) / 100000 > 0) ? true : false;
    }

    public static void main(String[] args) {


        double[] a = {1, 2, 3, 4, 100};
        System.out.println(foo1(a));
        System.out.println(foo2(a));
    }
}
