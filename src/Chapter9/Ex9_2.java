package Chapter9;

import java.util.Scanner;

//9.2. Составить программу, которая запрашивает название футбольной команды
//        и повторяет его на экране со словами "— это чемпион!".
public class Ex9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название футбольной команды");
        String club = scanner.nextLine();
        System.out.println(club + " - это чемпион!");
    }
}
