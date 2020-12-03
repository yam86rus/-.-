package Chapter11;

import java.util.Scanner;

//11.10. Дано натуральное число n (n меньше или равно 999999). Заполнить массив его цифрами, расположенными в обратном порядке
//        (первый элемент равен последней цифре, второй — предпоследней и т. д.).
//        Незаполненные элементы массива должны быть равны нулю.
//        Элементы массива, являющиеся цифрами числа n, вывести на экран.
public class Ex11_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число от 0 до 999999");
        int a = scanner.nextInt();
        int lenght = ("" + a).length();
        int[] array = new int[lenght];
        for (int i = 0; i <= lenght - 1; i++) {
            array[i] = a % 10;
            a /= 10;
        }
        for (int n : array) {
            System.out.print(n + " ");
        }

    }
}
