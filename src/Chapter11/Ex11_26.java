package Chapter11;

import java.util.Arrays;

//11.26. В массиве хранятся сведения о количестве осадков, выпавших за каждый день февраля.
//        Определить среднедневное количество осадков в этом месяце.
public class Ex11_26 {
    public static void main(String[] args) {
        double[] a = {4, 3, 2, 4, 3, 2, 5, 6, 4, 2, 3, 2, 4, 5, 3, 2, 4, 5, 3, 2, 4, 5, 6, 3, 2, 6, 4, 5, 2, 3};
        System.out.println(Arrays.stream(a).sum()/a.length);
    }
}
