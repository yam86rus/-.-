package Chapter8;

import java.util.stream.Stream;

//8.8. Напечатать полную таблицу умножения в виде:
//        1 х 1 = 1 2 x 1 = 2 ... 9 x 1 = 9
//        1 х 2 = 2 2 x 2 = 4 ... 9 x 2 = 18
//        ... ... ... ...
//        1 х 9 = 9 2 х 9 = 18 ... 9 х 9 = 81
public class Ex8_8 {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(e -> Stream.iterate(1, x -> x + 1)
                        .limit(10)
                        .forEach(r -> System.out.println(e + " * " + r + " = " + e * r)));
    }
}
