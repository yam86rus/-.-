package Chapter9;

import java.util.Scanner;

//9.61. Дано предложение. Определить число вхождений в него некоторого символа.
public class Ex9_61 {
    public static void main(String[] args) {
        String s = "Дано предложение";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ");
        String str = scanner.next();
        char ch1 = str.charAt(0);

        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ch1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

