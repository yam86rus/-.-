package Chapter9;

import java.util.Scanner;

//9.3. Составить программу, которая запрашивает отдельно имя и отдельно фами-
//        лию, а затем выводит их как одну символьную строку.
public class Ex9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surname = scanner.next();
        String result = name.concat(" ").concat(surname);
        System.out.println(result);
    }
}
