package Chapter12;

import java.util.Scanner;

//12.7. Составить программу:
//        а) заменяющую значение любого элемента пятой строки двумерного массива числом 1949;
//        б) заменяющую значение любого элемента двумерного массива числом a.
public class Ex12_7 {
    public static void showArrayInfo(int[][] array) {
        for (int[] ar : array) {
            for (int n : ar) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{2, 4, 6}, {12, 14, 16}, {22, 24, 26}, {32, 34, 36, 38}, {42, 44, 46, 48}};
        int a = 1;
        int b = 1949;
        array[4][1] = b;
        showArrayInfo(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер строки");
        int n1 = scanner.nextInt();
        System.out.println("Введите номер позиции элемента на строке");
        int n2 = scanner.nextInt();
        array[n1-1][n2-1] = b;
        showArrayInfo(array);
    }
}
