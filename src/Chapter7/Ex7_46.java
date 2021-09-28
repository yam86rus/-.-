package Chapter7;

import java.util.Arrays;

//7.46. Даны натуральное число m и целые числа a 1 , a 2 , ..., a m . Определить среднее
//        арифметическое тех чисел a i , которые кратны числу n. Известно, что числа,
//        кратные n, среди заданных имеются.
public class Ex7_46 {
    public static void main(String[] args) {
        int n = 2;
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        double result = Arrays.stream(array).filter(e -> e % n == 0).average().orElse(0);
        System.out.println(result);
    }
}
