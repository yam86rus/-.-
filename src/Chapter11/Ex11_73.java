package Chapter11;

import java.util.ArrayList;
import java.util.List;

//11.73. Дан массив целых чисел. Определить количество четных элементов и коли-чество элементов, оканчивающихся на цифру 5.
public class Ex11_73 {
    static void foo(int[] a) {
        int x1 = 0;
        for (int n : a) {
            if (n % 5 == 0 && n % 10 == 5) {
                x1++;
            }
        }
        System.out.println("Четных " + x1);
        System.out.println("Нечетных " + (a.length - x1));
    }

    static void foo(List<Integer> list) {
        int count = (int) list.stream().filter(integer -> integer%10==5 && integer%5==0).count();
        System.out.println("Коллекция содержит четные значения:  " + count);
        System.out.println("Коллекция содержит нечетные значения: " + (list.size()-count));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50, 155, 140};
        foo(a);
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(155);
        ar.add(140);
        foo(ar);
    }
}
