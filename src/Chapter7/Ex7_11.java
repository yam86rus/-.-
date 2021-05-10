package Chapter7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.11. Найти:
//        а) все трехзначные числа, чьи квадраты оканчиваются тремя цифрами, кото-
//        рые и составляют искомые числа;
//        б) все трехзначные числа, кратные семи и у которых сумма цифр также
//        кратна семи.
public class Ex7_11 {
    public static void main(String[] args) {
        Stream.iterate(100, x -> x + 1)
                .limit(900)
                .mapToInt(Integer::intValue)
                .filter(e -> Math.pow(e, 2) % 1000 == e)
                .forEach(System.out::println);
    }
}
