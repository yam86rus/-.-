package Chapter11;

import java.util.Arrays;
import java.util.stream.Stream;

//В массиве записаны результаты 20 игр футбольной команды
//        (если игра окончилась выигрышем данной команды, то записано число 3, проигры-шем — 2,
//        если игра окончилась вничью — 1). Определить количество вы-игрышей, количество ничьих и количество
//        проигрышей данной команды.
public class Ex11_74 {
    public static void main(String[] args) {
        int[] footballScore = new int[20];
        int min = 1;
        int max = 3;
        for (int i = 0; i < footballScore.length; i++) {
            footballScore[i] = min + (int) ((max - min + 1) * Math.random());
        }
        System.out.println(Arrays.toString(footballScore));
        int x1 = 0, x2 = 0, x3 = 0;
        for (int n : footballScore) {
            if (n == 1) {
                x1++;
            }
            if (n==2){
                x2++;
            }
            if (n==3){
                x3++;
            }
        }
        System.out.println(x1 + " " + x2 +" " + x3);
    }
}

