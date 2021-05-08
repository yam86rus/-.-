package Chapter7;

import java.util.stream.Stream;

//7.8. Определить количество трехзначных натуральных чисел, сумма цифр кото-
//        рых равна целому числу n (0 < n 27).
public class Ex7_8 {
    public static void main(String[] args) {
        for (int i = 0; i < 28; i++) {
            int temp = counter(i);
            System.out.println("Для n = " + i + " количество трехзначных числе с суммой = " + i + " равна: " + temp);
        }
    }

    private static int counter(int number) {
        return (int) Stream.iterate(100, x -> x + 1).limit(999).filter(e ->
            (e / 100 + e % 10 + e / 10 % 10) == number
          ).mapToInt(Integer::intValue).count();
    }
}
