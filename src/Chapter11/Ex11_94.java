package Chapter11;

import java.util.Arrays;

//11.94. Количество осадков (в миллиметрах), выпавших за каждый день января, хранится в массиве.
// Определить количество дней, в которые выпало осадков больше,
//        чем в среднем за один день месяца, и напечатать их дату (число месяца).
public class Ex11_94 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 4, 5, 3, 2, 3, 4, 5, 3, 2, 1};
        double avarage = Arrays.stream(array).average().orElse(0);
        System.out.println(Arrays.stream(array).filter(e -> e > avarage).count());
    }
}
