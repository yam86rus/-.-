package Chapter7;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.10. Найти все двузначные числа, которые делятся на n или содержат цифру n.
public class Ex7_10 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        int n = new Scanner(System.in).nextInt();
        List<Integer> list = Stream.iterate(10, x -> x + 1)
                .limit(90)
                .filter(e -> e % n == 0 || e / 10 == n || e % 10 == n)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
