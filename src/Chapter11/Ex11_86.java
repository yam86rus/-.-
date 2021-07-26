package Chapter11;

import java.util.Arrays;
import java.util.stream.Stream;

//11.86. Масса каждого из 25 человек хранится в массиве. Людей, имеющих массу более 100 кг,
//        будем условно называть полными (известно, что есть, по меньшей мере, один такой человек).
//        Определить среднюю массу полных людей и среднюю массу остальных людей.
public class Ex11_86 {
    public static void main(String[] args) {
        double[] people = {98.34, 57, 78.55, 78.32, 101.2, 78.99, 102, 102.33};
        System.out.println("Средняя масса полных людей " + Arrays.stream(people).filter(e -> e > 100).average().orElse(0));
        System.out.println("Средняя масса не полных людей " + Arrays.stream(people).filter(e -> e < 100).average().orElse(0));

    }
}
