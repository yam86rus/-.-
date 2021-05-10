package Chapter7;

import java.util.Optional;
import java.util.stream.Stream;

//7.12. Найти сумму целых положительных чисел, больших 30 и меньших 100, крат-
//        ных трем и оканчивающихся на 2, 4 и 8.
public class Ex7_12 {
    public static void main(String[] args) {
        Optional<Integer> optional = Stream.iterate(31, x -> x + 1)
                .limit(69)
                .filter(e -> e % 3 == 0 && (e % 10 == 2 || e % 10 == 4 || e % 8 == 0))
                .reduce((a, e) -> a + e);
        System.out.println(optional.isPresent() ? optional.get() : "значений нет");
    }
}
