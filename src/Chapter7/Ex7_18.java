package Chapter7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.18. Даны целые числа
//        а1, a2, a3 ...a20
//        Найти сумму
//        a2 + a4 + a6
//        Оператор цикла с шагом, отличным от 1 и –1, не использовать.
public class Ex7_18 {
    public static void main(String[] args) {

        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20).collect(Collectors.toList());
//    TODO доделать в stream

        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            i++;
        }

    }


}
