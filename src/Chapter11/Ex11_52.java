package Chapter11;

import java.util.Arrays;

//11.52. Дан массив целых чисел.
//        а) Все элементы, оканчивающиеся цифрой 4, уменьшить вдвое.
//        б) Все четные элементы заменить на их квадраты, а нечетные удвоить.
//        в) Четные элементы увеличить на a, а из элементов с четными номерами вычесть b.
public class Ex11_52 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0) {
                a[i] /= 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
