package Chapter11;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

//11.96. Известно количество осадков (в миллиметрах), выпавших в Москве за каждый год в
//        течение первых 50 лет нашего столетия. Вычислить среднее количество осадков и
//        отклонение от среднего для каждого года
public class Ex11_96 {
    public static void main(String[] args) {
        List<Integer> list = RandomNumber.getRandomList(100, 200, 50);
        int[] array = list.stream().mapToInt(i -> i).toArray();
        double average = Arrays.stream(array).average().orElse(0);
        System.out.println(list);
        System.out.println("Среднее значение: " + average);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        for (int year : array) {
            System.out.print(decimalFormat.format(year-average) + " ");
        }
    }
}
