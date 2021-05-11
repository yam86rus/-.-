package Chapter7;
//7.15. Даны натуральное число n и вещественные числа
//        1 2 , , ..., b1, b2,.... bn
//        Определить сумму тех вещественных чисел, которые больше p.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex7_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        List<Double> list = Arrays.asList(10.12, 20.23, 30.34, 40.45, 50.65);
        Optional<Double> optional = list.stream().filter(e -> e > n).reduce((a, e) -> a + e);
        System.out.println(optional.isPresent() ? optional.get() : "ничего нет");
    }
}
