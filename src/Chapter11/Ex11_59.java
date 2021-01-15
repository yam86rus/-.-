package Chapter11;

import java.util.Arrays;

//11.59. Определить частное от деления суммы положительных элементов массива на модуль суммы отрицательных элементов.
public class Ex11_59 {
    static void foo(int[] array) {
        double a = Math.abs(Arrays.stream(array).filter(e -> e < 0).sum());
        double b = Arrays.stream(array).filter(e->e>0).sum();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        int[] ar = {1, -2, 3, -4, 5};
        foo(ar);
    }
}
