package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.3. Найти сумму положительных нечетных чисел, меньших 50.
public class Ex7_3 {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, x -> x + 1).limit(50).collect(Collectors.toList());
        System.out.println(numbers);
        int result = numbers.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
