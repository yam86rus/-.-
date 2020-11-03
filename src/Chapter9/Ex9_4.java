package Chapter9;

import java.util.Scanner;

//9.4. Составить программу, которая запрашивает название государства и его сто-
//        лицы, а затем выводит сообщение: "Столица государства ... — город ..." (на
//        месте многоточий должны быть выведены соответствующие значения).
public class Ex9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название государства");
        String country = scanner.next();
        System.out.println("Введите столицу " + country);
        String capital = scanner.next();
        System.out.println("Столица государства " + country + " - город " + capital);
        scanner.close();
    }
}
