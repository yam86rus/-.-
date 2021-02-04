package Chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//11.72. Определить количество положительных и количество отрицательных эле-ментов массива.
public class Ex11_72 {
    static void foo(List<Integer> ar) {
        int a = 0, b = 0;
        for (Integer i : ar) {
            int res =  (i > 0) ? a++ : b++;
        }
            System.out.println("Меньше нуля " + b);
            System.out.println("Больше нуля " + a);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-5);
        list.add(15);
        list.add(-15);
        foo(list);
    }
}
