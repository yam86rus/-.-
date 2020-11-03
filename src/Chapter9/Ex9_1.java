package Chapter9;

import java.util.Scanner;

//9.1. Составить программу, которая:
//        а) запрашивает имя человека и повторяет его на экране;
//        б) запрашивает имя человека и повторяет его на экране с приветствием.
public class Ex9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Привет " + name);
    }

}
