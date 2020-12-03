package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//11.11.* Используя датчик случайных чисел, заполнить массив
//        из двадцати элемен-тов неповторяющимися числами.
public class Ex11_11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int down = 10;
        int up = 99;
        List<Integer> listRepeat = new ArrayList<>();
        while (list.size() < 20) {
            int a = down + (int) ((up - down + 1) * Math.random());
            if (list.contains(a)) {
                listRepeat.add(a);
                continue;
            } else {
                list.add(a);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Повторы \n" + listRepeat);
    }
}
