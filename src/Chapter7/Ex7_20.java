package Chapter7;

//.20. Даны натуральное число n и целые числа
//        a1, a2, ...an Получить:
//        а) a1 - a2 + a3 -...;
//        б)a1 + an;
//        в)a1 - a2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex7_20 {
    public static void main(String[] args) {
        int n = 5;
        int[] array = IntStream.iterate(1, x -> x + 1).limit(n).toArray();
        System.out.println(Arrays.toString(array));
        int result = 0;
        for (int i = 0; i < array.length; i +=2) {
            result += array[i];
        }
        for (int i = 1; i < array.length; i +=2) {
            result -= array[i];
        }
        System.out.println(result);

    }
}
