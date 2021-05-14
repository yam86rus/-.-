package Chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//7.19. Даны вещественные числа
//        c1, c2, c15  Найти -c1 -c3 -c5 -...
public class Ex7_19 {
    public static void main(String[] args) {
        int[] numbers = IntStream.iterate(1, x -> x + 1).limit(15).toArray();
        System.out.println(Arrays.toString(numbers));
        int result = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            result += numbers[i];
        }
        System.out.println(result);
    }
}
