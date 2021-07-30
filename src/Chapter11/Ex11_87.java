package Chapter11;

import java.util.Arrays;

//11.87. Рост 22 учеников класса представлен в виде массива. Рост мальчиков условно задан отрицательными числами.
//        Определить средний рост мальчиков и средний рост девочек.
public class Ex11_87 {
    public static void main(String[] args) {
        int[] students = {30, 31, 32, 33, 34, 35,36,37,38,39,40, -31, -32, -33, -33, -33, -33};
        System.out.println("Мальчики ".concat(String.valueOf(Arrays.stream(students).filter(e -> e < 0).average().orElse(0))));
        System.out.println("Девочки ".concat(String.valueOf(Arrays.stream(students).filter(e -> e > 0).average().orElse(0))));
    }
}
