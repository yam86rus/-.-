package Chapter7;

import java.util.Scanner;

//7.2. Вывести на экран все целые числа от a до b, кратные некоторому числу c.
public class Ex7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - начало");
        int a = scanner.nextInt();
        System.out.print("Введите число - конец");
        int b = scanner.nextInt();
        System.out.print("Введите число - кратность");
        int c = scanner.nextInt();
        for (int i = a; i < b; i++) {
            if (i % c == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
