package Chapter7;

import java.util.Arrays;
import java.util.stream.Stream;

//7.43. Даны вещественные числа b1 , b2 , ..., b9 . Определить среднее арифметическое
//        тех из них, которые больше 10. Известно, что числа, большие 10, среди задан-
//        ных имеются.
public class Ex7_43 {
    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        double average = Arrays.stream(array).filter(e -> e > 10).average().orElse(0);
        System.out.println(average);
    }
}
