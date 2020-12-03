package Chapter12;

import java.util.Scanner;

//12.3. Дан двумерный массив. Составить программу:
//        а) вывода на экран любого элемента второй строки массива;
//        б) вывода на экран любого элемента массива.
public class Ex12_3 {
    public static void main(String[] args) {
        int[][] array = {{4, -2}, {9, -3, 2, 6, 7}, {0, 0, 2, 7}, {1, 15}};
        Scanner scanner = new Scanner(System.in);
        //----------------- а
        System.out.println("Введите номер элемента второй строки массива от 1 до " + (array[1].length));
        int a = scanner.nextInt();
        System.out.println(array[1][a - 1]);

        //----------------- б
        System.out.println("Введите номер строки массива от 1 до " + array.length);
        int a1 = scanner.nextInt();
        System.out.println("Введите номера элемента массива в строке " + a1 + " от 1 до " + array[a1-1].length);
        int a2 = scanner.nextInt();
        System.out.println(array[a1-1][a2-1]);
    }
}
