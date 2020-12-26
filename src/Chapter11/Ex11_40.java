package Chapter11;

import java.util.Arrays;

//11.40. Дан массив. Вывести на экран сначала его неотрицательные элементы,
//        затем отрицательные.
public class Ex11_40 {
    static void foo(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] abc = {-3, 2, -1, 0, 1, -2, 3, 4, -5, 6};
        foo(abc);

    }
}
