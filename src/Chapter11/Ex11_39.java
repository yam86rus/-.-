package Chapter11;

import java.util.Arrays;

//11.39. Дан массив. Напечатать:
//        а) второй, четвертый и т. д. элементы;
//        б) третий, шестой и т. д. элементы.
public class Ex11_39 {
    static void foo1(String[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        } else {
            for (int i = 1; i < arr.length; i += 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void foo2(String[] arr) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] cars = {"audi", "bmw", "mazda", "uaz", "subaru", "toyota"};
        System.out.println(Arrays.toString(cars));
        foo1(cars);
        System.out.println();
        foo2(cars);
    }
}
