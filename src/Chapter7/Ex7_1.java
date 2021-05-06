package Chapter7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.1. Вывести на экран все целые числа от 100 до 200, кратные трем.
public class Ex7_1 {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        List<Integer> list = Stream.iterate(100, x -> x+1).limit(100).filter(e -> e % 3 == 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
