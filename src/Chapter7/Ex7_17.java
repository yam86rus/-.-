package Chapter7;
//7.17. Даны натуральное число m и целые числа
//        x1, x2, x3 .....Xm
//        Определить сумму
//        тех целых чисел, которые кратны числу n.

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex7_17 {
    public static void main(String[] args) {
        System.out.println("Введите количество целых чисел");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(m).filter(e -> e % n == 0).collect(Collectors.toList());
        System.out.println(list);

    }
}
