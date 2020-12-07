package Chapter11;

import java.util.Scanner;

//11.13. Составить программу вывода на экран любого элемента массива по его ин-дексу.
public class Ex11_13 {
    public static void main(String[] args) {
        int[] arra = {1, 2, 4, 6, 7, 89, 33, 2, 3, 55};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс в массиве длиной до " + arra.length);
        int a = scanner.nextInt();
        System.out.println(arra[a - 1]);
    }
}
