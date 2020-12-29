package Chapter11;

import java.util.Arrays;

//11.43. В массиве хранится информация о количестве осадков, выпавших за каж-дый день января.
//        Определить, в какие числа месяца осадков не было.
public class Ex11_43 {
    static void foo1(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 2, 3, 0, 2, 0, 1, 2, 1, 0, 0, 3};
        System.out.println(Arrays.toString(a));
        foo1(a);
    }
}
