package Chapter7;

import java.util.Arrays;

//7.33. Даны натуральное число n и вещественные числа
//        a1,a2,...an
//        Определить
//        количество отрицательных и количество положительных вещественных
//        чисел
public class Ex7_33 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -2, -3, -4};
        System.out.println(Arrays.toString(array));
        System.out.println("Больше нуля " + Arrays.stream(array).filter(e->e>0).count() + " шт.");
        System.out.println("Меньше нуля " + Arrays.stream(array).filter(e->e<0).count() + " шт.");

    }
}
