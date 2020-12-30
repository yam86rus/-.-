package Chapter11;

import java.util.Arrays;

//11.47. Дан массив вещественных чисел.
//        а) Каждый элемент, больший 10, заменить его квадратным корнем.
//        б) Все элементы массива с четными номерами заменить их абсолютной ве-личиной.
public class Ex11_47 {
    public static void main(String[] args) {
        double[] a = {1, 21, 3, 41, 51, 6, 111};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                a[i] =  Math.sqrt(a[i]);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
