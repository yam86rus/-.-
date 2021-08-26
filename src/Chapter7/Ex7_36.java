package Chapter7;

import java.util.List;

//7.36. Даны натуральное число n и вещественные числа x1, x2, ..., xn. Найти коли-
//        чество вещественных чисел, которые больше своих "соседей", т. е. предшест-
//        вующего и последующего.
public class Ex7_36 {
    public static void main(String[] args) {
        List<Integer> list = Ex7_FillListRandom.getFillList(10, 20, 20);
        System.out.println(list);
        int n = 14;
        int result = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1) ) {
                result++;
            }
        }
        System.out.println(result);
    }
}
