package Chapter11;

import java.util.List;

//11.97. Найти элемент, наиболее близкий к среднему значению всех элементов
//        массива
public class Ex11_97 {
    public static void main(String[] args) {
        List<Integer> list = RandomNumber.getRandomList(100,200,20);
        System.out.println(list);
        double average = list.stream().mapToInt(i->i).average().orElse(0);
        System.out.println("Средняя " + average);


    }
}
