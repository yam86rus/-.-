package Chapter9;

import java.util.Scanner;

//9.120. Дано слово, оканчивающееся символом "_". Вставить букву т после k-й буквы.
public class Ex9_120 {
    public static void main(String[] args) {
        String s = "Любознательный";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую цифру от 0 до " + (s.length()));
        int a = scanner.nextInt();
        s = new StringBuffer(s).replace(a,a,"м").toString();
        System.out.println(s);
    }
}
