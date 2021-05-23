package Chapter7;

import java.util.ArrayList;
import java.util.List;

//7.27. Даны вещественные числа b1, b2, ..., b8. Определить количество тех из них,
//        которые меньше 100.
public class Ex7_27 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int min = 0;
        int max = 200;

        for(int i=0; i<20;i++){
            int random = min + (int) ((max - min + 1) * Math.random());
            list.add(random);
        }
//        System.out.println(list);
        long result = list.stream().filter(e->e<100).peek(e-> System.out.print(e+" ")).count();
        System.out.println();
        System.out.println(result);
    }
}
