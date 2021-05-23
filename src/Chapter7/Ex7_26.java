package Chapter7;

import java.util.Arrays;

//7.26. Известны данные о температуре воздуха в течение месяца. Определить,
//        сколько раз температура опускалась ниже 0 С.
public class Ex7_26 {
    public static void main(String[] args) {
        int min = -5;
        int max = 10;
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            int random = min + (int) ((max - min + 1) * Math.random());
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));
        long result = Arrays.stream(array).filter(e -> e < 0).count();
        System.out.println("Температура опускалась ниже нуля ".concat(String.valueOf(result)).concat(" раз"));

    }

}
