package Chapter11;

import java.util.Arrays;

//11.28. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число.
public class Ex11_28 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, -5};
        int[] array2 = {1, 2, 3, -7};
        boolean result1 = ((Arrays.stream(array1).sum()) > 0) ? true : false;
        System.out.println(result1);
        boolean result2 = ((Arrays.stream(array2).sum()) > 0) ? true : false;
        System.out.println(result2);

    }
}
