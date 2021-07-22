package Chapter11;

import java.util.Arrays;

//11.84. В массиве хранятся сведения о количестве осадков, выпавших за каждый
//        день августа. Определить среднее количество осадков, выпавших в дни, когда шел дождь
public class Ex11_84 {
    public static void main(String[] args) {
        int[] array = {0,0,0,1,1,2,2,0,2,2};
        System.out.println(Arrays.stream(array).filter(e->e>0).average().orElse(0));
    }
}
