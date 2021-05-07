package Chapter7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//7.6. Составить программу поиска четырехзначных чисел, которые при делении на
//        133 дают в остатке 125, а при делении на 134 дают в остатке 111.
public class Ex7_6 {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1000,x->x+1).limit(9000).filter(e->e%133==125).collect(Collectors.toList());
        System.out.println(list);
        List<Integer> list2 = Stream.iterate(1000,x->x+1).limit(9000).filter(e->e%134==111).collect(Collectors.toList());
        System.out.println(list2);
    }
}
