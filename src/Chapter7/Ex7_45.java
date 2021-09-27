package Chapter7;

import java.util.Arrays;

//7.45. Даны целые числа c 1 , c 2 , ..., c 12 . Определить среднее арифметическое четных
//        из них. Известно, что четные числа среди заданных имеются.
public class Ex7_45 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double result = Arrays.stream(array).filter(e->e%2==0).average().orElse(0);
        System.out.println(result);
    }
}
