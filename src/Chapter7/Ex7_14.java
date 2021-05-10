package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//7.14. Даны вещественные числа a1, a2, ..., a8. Определить сумму тех из них, кото-
//        рые больше 10,75.
public class Ex7_14 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(10.5, 11.5, 12.5, 13.5, 9.5, 8.5, 7.5, 6.5);
        Optional<Double> optional = list.stream()
                .filter(e -> e > 10.75)
                .reduce((a, e) -> a + e);
        System.out.println(optional.isPresent() ? optional.get() : "данный нет");
    }
}
