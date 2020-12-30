package Chapter11;

import java.util.Arrays;

//11.46. Дан массив вещественных чисел.
//        а) Каждый отрицательный элемент заменить его абсолютной величиной.
//        б) Все элементы с нечетными номерами заменить их квадратным корнем.
public class Ex11_46 {
    static void foo(int[] array) {
        for (int n : array) {
            if (n < 0) {
                System.out.print(n * -1 + " ");
            } else {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    static void foo2(int[] array) {
        for (int i = 0; i < array.length; i+=2) {
            array[i]=(int)Math.pow(array[i],2);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a = {2, -4, 6, -7, -8, 9, -12, 14, 15};
        System.out.println("Дан массив\n" + Arrays.toString(a));
        foo(a);
        foo2(a);

    }
}
