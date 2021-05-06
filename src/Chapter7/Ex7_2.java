package Chapter7;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.2. Вывести на экран все целые числа от a до b, кратные некоторому числу c.
public class Ex7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - начало");
        int a = scanner.nextInt();
        System.out.print("Введите число - конец");
        int b = scanner.nextInt();
        System.out.print("Введите число - кратность");
        int c = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % c == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        List<Integer> list = Stream.iterate(a, x -> x + 1).limit(b - a).filter(e -> e % c == 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
