package Chapter11;

import java.util.Arrays;

//11.57. Известны данные о количестве осадков, выпавших за каждый день февраля.
//        Найти общее число осадков, выпавших по четным числам месяца.
public class Ex11_57 {
    static void foo(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] osadki = {1, 1, 2, 4, 3, 5, 6, 3, 3, 2, 4, 3, 1};
        foo(osadki);
    }
}
