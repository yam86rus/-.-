package Chapter11;

import java.util.Arrays;

//11.91. Дан массив. Найти количество элементов, значение которых больше среднего арифметического минимального
//        и максимального элементов массива,
//        и напечатать их номера.
public class Ex11_91 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,2,2,3,4,5,6,4,2,1};
        double avarage = Arrays.stream(array1).average().orElse(0);
        Arrays.sort(array1);
        System.out.println(array1[0]);
        System.out.println(array1[array1.length-1]);
        System.out.println(avarage);

    }
}
