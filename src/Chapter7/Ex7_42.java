package Chapter7;

import java.util.Arrays;

//7.42. В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш —
//        0, за ничью — 1. Известно число очков, полученных командой за каждую из
//        проведенных игр. Определить количество выигрышей, количество проигрышей и количество ничьих.
public class Ex7_42 {
    public static void main(String[] args) {
        int[] football = {3, 0, 1, 1, 0, 0, 3, 3, 0, 1};
        System.out.println(Arrays.toString(football));
        System.out.println("Выигрыш ".concat(String.valueOf(Arrays.stream(football).filter(e->e==3).count())));
        System.out.println("Ничья ".concat(String.valueOf(Arrays.stream(football).filter(e->e==1).count())));
        System.out.println("Проигрыш ".concat(String.valueOf(Arrays.stream(football).filter(e->e==0).count())));

    }
}
