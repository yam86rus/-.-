package Chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//7.16. Даны целые числа
//        d1 d2 ....d10
//        Определить сумму тех из них, которые являются четными
public class Ex7_16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 0)
                .sum();
        System.out.println(result);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result2 = list.stream().filter(e -> e % 2 == 0)
                .reduce((a, e) -> a + e)
                .get();
        System.out.println(result2);

        int result3 = IntStream.iterate(1, x -> x + 1)
                .limit(10)
                .filter(e -> e % 2 == 0)
                .sum();
        System.out.println(result3);
    }
}
