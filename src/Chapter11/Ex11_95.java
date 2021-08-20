package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//11.95. В массиве записаны оценки по информатике 22 учеников класса. Определить количество учеников,
// оценка которых меньше средней оценки по классу,
//        и вывести номера элементов массива, соответствующих таким ученика.
public class Ex11_95 {
    public static void main(String[] args) {
        int[] array = {4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 4, 3, 4, 5, 3, 4, 5, 5, 5, 4};
        double average = Arrays.stream(array).average().orElse(0);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]<average){
                list.add(i);
            }
        }
        System.out.println("Номера элементов массива " + list);
        System.out.println("Количество учеников, оценка которых меньше средней " + list.size());
    }
}
