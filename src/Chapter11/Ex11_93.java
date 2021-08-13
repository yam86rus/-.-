package Chapter11;

import java.util.Arrays;
import java.util.List;

//11.93. В массиве записана информация о стоимости 20 видов товара.
//        Определить, сколько видов товара имеют стоимость,
//        меньшую, чем средняя стоимость всех видов товара.
public class Ex11_93 {
    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(100, 200, 134, 123, 1223, 234, 324, 23, 24, 53, 23, 4, 56, 77, 3, 222);
        double average = price.stream().mapToInt(Integer::intValue).average().orElse(0);
        long result = price.stream().filter(e -> e < average).count();
        System.out.println(" Средняя стоимость товаров " + average);
        System.out.println(" Товаров стоимостью меньше средней " + result + " шт");
    }
}
