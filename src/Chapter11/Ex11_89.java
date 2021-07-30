package Chapter11;

import java.util.Arrays;

//11.89. Известен рост каждого ученика класса. Рост мальчиков условно задан отри-цательными числами.
//        Верно ли, что средний рост мальчиков превышает средний рост девочек более чем на 10 см?
public class Ex11_89 {
    public static void main(String[] args) {
        int[] children = {1, 2, 3, 4, 5, -1, -2, -3, -5, -6};
        System.out.println(Arrays.stream(children)
                .filter(e -> e < 0)
                .average()
                .orElse(0) + 10 > Arrays.stream(children)
                .filter(e -> e > 0)
                .average()
                .orElse(0) ? true : false);
    }
}
