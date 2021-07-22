package Chapter11;

import java.util.Arrays;

//11.85. Найти средние арифметические положительных и отрицательных элементов
//        массива
public class Ex11_85 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5, -6, -7};
        System.out.println("положительные " + Arrays.stream(array).filter(e -> e > 0).average().orElse(0));
        System.out.println("Отрицательные " + Arrays.stream(array).filter(e -> e < 0).average().orElse(0));
    }
}
