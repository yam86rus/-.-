package Chapter11;

import java.util.Arrays;

//11.60. Дан массив целых чисел. Выяснить:
//        а) верно ли, что сумма элементов, которые больше 20, превышает 100;
//        б) верно ли, что сумма элементов, которые меньше 50, есть четное число.
public class Ex11_60 {
    static boolean foo1(int[] array) {
        int result = 0;
        for (int n : array) {
            if (n > 20) {
                result += n;
            }
        }
        return (result > 100) ? true : false;
    }

    static boolean foo2(int[] array){
        int result = Arrays.stream(array).filter(e->e>20).sum();
        return (result > 100) ? true : false;
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40,50};
        System.out.println(foo1(ar));
        System.out.println(foo2(ar));
    }
}
