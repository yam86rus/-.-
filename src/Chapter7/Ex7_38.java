package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//7.38. Задано n троек целых чисел a, b, c (a b c). Определить, сколько троек мо-
//        жет быть использовано для построения треугольника со сторонами a, b, c.
public class Ex7_38 {
    static boolean checkTriangle(int[] array) {
        if (array[0] + array[1] < array[2]) {
            return false;
        } else if (array[0] + array[2] < array[1]) {
            return false;
        } else if (array[1] + array[2] < array[0]) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{4, 5, 6,});
        list.add(new int[]{5, 4, 3,});
        list.add(new int[]{2, 5, 8,});
        list.add(new int[]{9, 3, 4,});
        for (int[] n : list) {
            System.out.print(Arrays.toString(n) + " " + checkTriangle(n));
            System.out.println();
        }
    }
}
