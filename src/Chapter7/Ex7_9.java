package Chapter7;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.9. Найти:
//        а) все двузначные числа, сумма квадратов цифр которых делится на 13;
//        б) все двузначные числа, обладающие следующим свойством: если к сумме
//        цифр числа прибавить квадрат этой суммы, то получится снова искомое число.
public class Ex7_9 {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(10, x -> x + 1).limit(99).filter(e -> (Math.pow((e / 10), 2) + Math.pow((e % 10), 2)) % 13 == 0).collect(Collectors.toList());
        System.out.println(numbers);
        List<Integer> numbers2 = Stream.iterate(10, x -> x + 1).limit(99).filter(e -> ((e / 10 + e % 10) + Math.pow((e / 10 + e % 10), 2)) == e).collect(Collectors.toList());
        System.out.println(numbers2);
    }
}
