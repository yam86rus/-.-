package Chapter9;

import java.util.Scanner;

//9.15. Дано слово. Вывести на экран его k-й символ
public class Ex9_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String someText = "Газпром";
        System.out.println("Дана строка: \"" + someText + "\"");
        System.out.println("Введите k-й символ");
        int a = scanner.nextInt();
        try {
            System.out.println(a + "-й символ: " + someText.charAt(a - 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого символа нет, последний символ под номером: " + (someText.length()));
        }
    }
}
