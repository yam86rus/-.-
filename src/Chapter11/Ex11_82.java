package Chapter11;

import java.util.Arrays;

//11.82. Найти среднее арифметическое элементов массива, больших числа 10.
public class Ex11_82 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double result = Arrays.stream(array).filter(e->e>10).average().orElse(0);
        System.out.println(result);
    }
}
