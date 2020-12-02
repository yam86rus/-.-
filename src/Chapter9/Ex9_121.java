package Chapter9;

import java.util.Scanner;

//9.121. Дано слово, оканчивающееся символом "_". Составить программу,
//        которая вставляет некоторую заданную букву после буквы с заданным номером.
public class Ex9_121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "Мерзопакостный";
        System.out.println("Дано слово \"" + s + "\"");
        System.out.println("Введите букву для замены в этом слове");
        char f = scanner.nextLine().charAt(0);
        System.out.println("Введите номер буквы, которая будет заменена. Интервал от 1 до " + s.length());
        int a = scanner.nextInt();
        while (a > s.length() || a < 1) {
            System.out.println("Число " + a + " находиться вне диапозона от 0 до " + s.length() + " .Попробуйте еще раз");
            a = scanner.nextInt();
        }
        s = new StringBuffer(s).replace(a - 1, a, "" + f).toString();
        System.out.println(s);

    }
}
