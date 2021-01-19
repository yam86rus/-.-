package Chapter11;

import java.util.Arrays;

//11.70. В массиве записаны результаты 20 игр футбольной команды (если игра окончилась выигрышем данной команды,
//        то записано число 3, проигры-шем — 0, если игра окончилась вничью — 1).
//        Определить общее количест-во выигрышей и ничьих данной команды.
public class Ex11_70 {
    static void foo(int[] array) {
        int win = 0, loss = 0, draw = 0;
        for (int n : array) {
            if (n == 3) win++;
            else if (n == 0) loss++;
            else draw++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Побед " + win);
        System.out.println("Проигрышей " + loss);
        System.out.println("Ничьи " + draw);

    }

    public static void main(String[] args) {
        int[] ar = {3, 0, 3, 3, 1, 3, 0, 1, 0, 3};
        foo(ar);
    }
}
