package Chapter7;

import java.util.Arrays;

//7.34. Даны натуральное число m и целые числа
//       a1,a2,an Определить количество чисел, кратных трем, и количество чисел, кратных семи
public class Ex7_34 {

    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Кратно трем " + Arrays.stream(array).filter(e->e%3==0).count() + " шт .");
        System.out.println("Кратно семи " + Arrays.stream(array).filter(e->e%7==0).count() + " шт .");
    }
}
