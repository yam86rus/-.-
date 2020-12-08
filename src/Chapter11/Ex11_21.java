package Chapter11;

import java.util.Arrays;

//11.21. В массиве хранятся сведения о количестве осадков, выпавших за каждый
//        день января. Определить общее количество осадков за январь.
public class Ex11_21 {
    public static int summ(int[] ar) {
        int result = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            result += ar[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] january = {10, 11, 7, 5, 9, 10, 4, 3, 5, 10, 3, 10, 50, 44, 3, 5, 12, 23, 32};
        int summMonth = Arrays.stream(january).sum();
        System.out.println(summMonth);

    }
}
