package Chapter12;

import java.util.HashSet;
import java.util.Set;

//12.31.  *Используя датчик случайных чисел, заполнить двумерный массив неповто-
//        ряющимися числами.
public class Ex12_31 {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        int down = 0;
        int up = 30;
        Set<Integer> set = new HashSet<>();
        while (set.size()<10){
            int n = down + (int) ((up - down + 1) * Math.random());
            set.add(n);
        }
        System.out.println(set);
    }
}
