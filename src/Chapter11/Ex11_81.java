package Chapter11;

import java.util.Arrays;

//11.81. Известны данные о количестве осадков, выпавших за каждый день марта.
// Верно ли, что осадков не было 10 дней в месяц?
public class Ex11_81 {
    public static void main(String[] args) {
        int[] array = {0, 0, 3, 3, 4, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 4};
        System.out.println(Arrays.stream(array).filter(e -> e > 0).count() > 10 ? true : false);
    }
}
