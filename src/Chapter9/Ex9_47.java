package Chapter9;

import java.util.Scanner;

//9.47. Составить программу, формирующую строку,
//        состоящую из любого заданно-го количества любых одинаковых символов.
public class Ex9_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество  символов");
        int a = scanner.nextInt();
        StringBuilder str1 = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            str1.append('&');
        }
        String s = str1.toString();
        System.out.println(s);
    }
}
