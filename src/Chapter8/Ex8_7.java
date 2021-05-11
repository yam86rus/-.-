package Chapter8;
//.7. Напечатать полную таблицу умножения в виде:
//        1 х 1 = 1 1 х 2 = 2 ... 1 х 9 = 9
//        2 х 1 = 2 2 х 2 = 4 ... 2 х 9 = 18
//        ... ... ... ...
//        9 х 1 = 9 9 х 2 = 18 ... 9 х 9 = 81

import java.util.stream.Stream;

public class Ex8_7 {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(e -> Stream.iterate(1, y -> y + 1)
                        .limit(10)
                        .forEach(y -> System.out.println(y + " * " + e + " = " + y * e)));
    }
}
