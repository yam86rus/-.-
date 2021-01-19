package Chapter11;

import java.util.Arrays;
import java.util.Scanner;

//11.67. В массиве хранятся сведения об общей стоимости товаров, проданных фир-мой за каждый день марта.
//        Определить количество дней, в которые стои-мость проданных товаров превысила значение s.
public class Ex11_67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {13, 24, 42, 53, 24, 54, 64, 75, 32, 52, 52, 11, 23, 47};
        System.out.println("Данн массив с данными по выручк за месяц");
        System.out.println(Arrays.toString(array));
        System.out.println("Введите сумму");
        int n = scanner.nextInt();
        System.out.print("Количество дней в которых, сумма реализиванных товаров больше " + n + " = ");
        System.out.print(Arrays.stream(array).filter(value -> value>n).count() + " д.");
    }
}
