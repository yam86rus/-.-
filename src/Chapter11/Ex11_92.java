package Chapter11;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//11.92. Рост 25 учеников класса представлен в виде массива.
//        Определить количест-во учеников, рост которых больше среднего роста по классу.
public class Ex11_92 {
    public static void main(String[] args) {
        List<Integer> students = RandomNumber.getRandomList(140,160,25);
        System.out.println(students);
        double average = students.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Средний рост " + average + " cм");
        long result = students.stream().filter(e->e>average).count();
        System.out.println("Количество учеников, рост которых больше среднего = " + result + " чел.");
    }
}
