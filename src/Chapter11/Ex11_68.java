package Chapter11;

import java.util.Arrays;

//11.68. Рост каждого из 22 учеников класса представлен в виде массива.
//        Опреде-лить количество учеников, рост которых не превышает значения r.
public class Ex11_68 {
    public static void main(String[] args) {
        int[] ar = {87, 88, 89, 85, 86, 89, 91, 86, 85, 84};
        int r = 87;
        System.out.print("Количество учеников, чей возраст не превышает " + r + " см = ");
        System.out.println(Arrays.stream(ar).filter(value -> value <= r).count() + " чел.");
    }
}
