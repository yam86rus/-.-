package Chapter10;

import java.util.Arrays;
import java.util.stream.IntStream;

//10.20. Получить все шестизначные счастливые номера. Счастливым называют такое шестизначное число, в котором сумма его первых трех цифр равна сумме
//        его последних трех цифр. (Определить функцию для расчета суммы цифр
//        трехзначного числа.)
public class Ex10_20 {
    public static void main(String[] args) {
        int[] numbers = IntStream.iterate(100000, x -> x + 1)
                .limit(900000)
                .filter(e -> (e % 10 + e / 10 % 10 + e / 100 % 10) == (e / 1000 % 10 + e / 10000 % 10 + e / 100000))
                .toArray();
        System.out.println(numbers.length);
    }
}
