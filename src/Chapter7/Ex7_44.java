package Chapter7;

import java.util.Arrays;

//7.44. Даны натуральное число х и целые числа a 1 , a 2 , ..., a x . Определить среднее
//        арифметическое тех чисел a i , которые больше некоторого числа n. Известно,
//        что числа, большие n, среди заданных имеются
public class Ex7_44 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.stream(array).filter(e -> e > n).average().orElse(0));
    }
}
