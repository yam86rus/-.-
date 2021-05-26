package Chapter7;

import java.util.Arrays;
import java.util.stream.Stream;

//7.28. Даны натуральное число n и целые числа
//        1 2 , , ..., . n a a a
//        Определить:
//        а) количество чисел
//        i a
//        , которые больше p;
//        б) количество чисел
//        i a
//        , которые оканчиваются цифрой 5;
//        в) количество чисел
//        i a
//        , которые кратны числу k
public class Ex7_28 {
    public static void main(String[] args) {
        int n = 10;
        int down = -50;
        int up = 50;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        Arrays.stream(array).filter(e->e>30).forEach(System.out::println);
        System.out.println(Arrays.toString(array));
    }
}
