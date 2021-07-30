package Chapter11;

import java.util.Arrays;

//11.83. Найти среднее арифметическое элементов массива, меньших некоторого
//        числа m
public class Ex11_83 {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double m = 5;
        System.out.println(Arrays.stream(array).filter(e -> e < m).average().orElse(0));
    }
}
