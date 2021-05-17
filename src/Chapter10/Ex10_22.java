package Chapter10;

import java.util.Arrays;
import java.util.List;

//10.22. Даны шесть различных чисел. Определить максимальное из них.
//        (Определить функцию, находящую максимум из двух различных чисел.)
public class Ex10_22 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 3, 3, 2, 1);
        System.out.println(list);
        System.out.println(list.stream().max(Integer::compareTo).get());
    }
}
