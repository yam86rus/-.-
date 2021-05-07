package Chapter7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.5. Составить программу поиска трехзначных чисел, которые при делении на 47
//        дают в остатке 43, а при делении на 43 дают в остатке 47.
public class Ex7_5 {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(100,x->x+1).limit(900).filter(e->e%47==43).collect(Collectors.toList());
        List<Integer> list2 = Stream.iterate(100,x->x+1).limit(900).filter(e->e%43==47).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);
    }
}
